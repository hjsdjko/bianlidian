









package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 收银
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/goodsShouyin")
public class GoodsShouyinController {
    private static final Logger logger = LoggerFactory.getLogger(GoodsShouyinController.class);

    @Autowired
    private GoodsShouyinService goodsShouyinService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;

    //级联表service
    @Autowired
    private YuangongService yuangongService;

    // 列表详情的表级联service
    @Autowired
    private GoodsShouyinListService goodsShouyinListService;
//    @Autowired
//    private YonghuService yonghuService;
    @Autowired
    private GoodsService goodsService;


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role))
            return R.error(511,"权限为空");
        else if("员工".equals(role))
            params.put("yuangongId",request.getSession().getAttribute("userId"));
        if(params.get("orderBy")==null || params.get("orderBy")==""){
            params.put("orderBy","id");
        }
        PageUtils page = goodsShouyinService.queryPage(params);

        //字典表数据转换
        List<GoodsShouyinView> list =(List<GoodsShouyinView>)page.getList();
        for(GoodsShouyinView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        GoodsShouyinEntity goodsShouyin = goodsShouyinService.selectById(id);
        if(goodsShouyin !=null){
            //entity转view
            GoodsShouyinView view = new GoodsShouyinView();
            BeanUtils.copyProperties( goodsShouyin , view );//把实体数据重构到view中

                //级联表
                YuangongEntity yuangong = yuangongService.selectById(goodsShouyin.getYuangongId());
                if(yuangong != null){
                    BeanUtils.copyProperties( yuangong , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setYuangongId(yuangong.getId());
                }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody GoodsShouyinEntity goodsShouyin, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,goodsShouyin:{}",this.getClass().getName(),goodsShouyin.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role))
            return R.error(511,"权限为空");
        else if("员工".equals(role))
            goodsShouyin.setYuangongId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        Wrapper<GoodsShouyinEntity> queryWrapper = new EntityWrapper<GoodsShouyinEntity>()
            .eq("goods_shouyin_uuid_number", goodsShouyin.getGoodsShouyinUuidNumber())
            .eq("yuangong_id", goodsShouyin.getYuangongId())
            .eq("goods_shouyin_types", goodsShouyin.getGoodsShouyinTypes())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        GoodsShouyinEntity goodsShouyinEntity = goodsShouyinService.selectOne(queryWrapper);
        if(goodsShouyinEntity==null){
            goodsShouyin.setInsertTime(new Date());
            goodsShouyin.setCreateTime(new Date());
            goodsShouyinService.insert(goodsShouyin);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody GoodsShouyinEntity goodsShouyin, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,goodsShouyin:{}",this.getClass().getName(),goodsShouyin.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role))
            return R.error(511,"权限为空");
        else if("员工".equals(role))
            goodsShouyin.setYuangongId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        //根据字段查询是否有相同数据
        Wrapper<GoodsShouyinEntity> queryWrapper = new EntityWrapper<GoodsShouyinEntity>()
            .notIn("id",goodsShouyin.getId())
            .andNew()
            .eq("goods_shouyin_uuid_number", goodsShouyin.getGoodsShouyinUuidNumber())
            .eq("yuangong_id", goodsShouyin.getYuangongId())
            .eq("goods_shouyin_types", goodsShouyin.getGoodsShouyinTypes())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        GoodsShouyinEntity goodsShouyinEntity = goodsShouyinService.selectOne(queryWrapper);
        if(goodsShouyinEntity==null){
            //  String role = String.valueOf(request.getSession().getAttribute("role"));
            //  if("".equals(role)){
            //      goodsShouyin.set
            //  }
            goodsShouyinService.updateById(goodsShouyin);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }
    /**
    *收银
    */
    @RequestMapping("/shouyin")
    public R inGoodsShouyinList(@RequestBody  Map<String, Object> params,HttpServletRequest request){
        logger.debug("shouyin方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        //params:{"map":{"1":2,"2":3},"goodsShouyinTypes":"1","yonghuid":"2"}

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role))
            return R.error(511,"权限为空");

        String goodsShouyinTypes = String.valueOf(params.get("goodsShouyinTypes"));//收银类型



        Map<String, Integer> map = (Map<String, Integer>) params.get("map");
        if(map == null || map.size() == 0)
            return R.error(511,"购买商品不能为空");

        Set<String> ids = map.keySet();
        Double goodsShouyinTruePrice = 0.0;

        List<GoodsEntity> goodsList = goodsService.selectBatchIds(ids);
        if(goodsList == null || goodsList.size() == 0){
            return R.error(511,"查数据库查不到数据");
        }else{
            for(GoodsEntity w:goodsList){
                Integer value = w.getGoodsKucunNumber() - map.get(String.valueOf(w.getId()));
                if(value <0){
                    return R.error(511,"购买数量不能大于库存数量");
                }
                w.setGoodsKucunNumber(value);
                goodsShouyinTruePrice += w.getGoodsXiaoshouMoney() * map.get(String.valueOf(w.getId()));
            }
        }

        //当前表
        GoodsShouyinEntity goodsShouyinEntity = new GoodsShouyinEntity<>();
            goodsShouyinEntity.setGoodsShouyinUuidNumber(String.valueOf(new Date().getTime()));
            if("员工".equals(role))
                goodsShouyinEntity.setYuangongId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
            goodsShouyinEntity.setGoodsShouyinTruePrice(goodsShouyinTruePrice);
            goodsShouyinEntity.setGoodsShouyinTypes(Integer.valueOf(goodsShouyinTypes));
            goodsShouyinEntity.setGoodsShouyinContent("");
            goodsShouyinEntity.setInsertTime(new Date());
            goodsShouyinEntity.setCreateTime(new Date());


        boolean insertGoodsShouyin = goodsShouyinService.insert(goodsShouyinEntity);
        if(insertGoodsShouyin){
            //级联表
            ArrayList<GoodsShouyinListEntity> goodsShouyinLists = new ArrayList<>();
            for(String id:ids){
                GoodsShouyinListEntity goodsShouyinListEntity = new GoodsShouyinListEntity();
                goodsShouyinListEntity.setGoodsShouyinId(goodsShouyinEntity.getId());
                goodsShouyinListEntity.setGoodsId(Integer.valueOf(id));
                goodsShouyinListEntity.setGoodsShouyinListNumber(map.get(id));
                goodsShouyinListEntity.setInsertTime(new Date());
                goodsShouyinListEntity.setCreateTime(new Date());
                goodsShouyinLists.add(goodsShouyinListEntity);
                goodsService.updateBatchById(goodsList);
            }
            goodsShouyinListService.insertBatch(goodsShouyinLists);
        }

        return R.ok();
    }
    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        goodsShouyinService.deleteBatchIds(Arrays.asList(ids));
        goodsShouyinListService.delete(new EntityWrapper<GoodsShouyinListEntity>().in("goods_shouyin_id",ids));
        return R.ok();
    }

    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        try {
            List<GoodsShouyinEntity> goodsShouyinList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            GoodsShouyinEntity goodsShouyinEntity = new GoodsShouyinEntity();
//                            goodsShouyinEntity.setGoodsShouyinUuidNumber(data.get(0));                    //收银流水号 要改的
//                            goodsShouyinEntity.setYuangongId(Integer.valueOf(data.get(0)));   //员工 要改的
//                            goodsShouyinEntity.setGoodsShouyinTruePrice(data.get(0));                    //实付金额 要改的
//                            goodsShouyinEntity.setGoodsShouyinTypes(Integer.valueOf(data.get(0)));   //收银类型 要改的
//                            goodsShouyinEntity.setGoodsShouyinContent("");//照片
//                            goodsShouyinEntity.setInsertTime(date);//时间
//                            goodsShouyinEntity.setCreateTime(date);//时间
                            goodsShouyinList.add(goodsShouyinEntity);


                            //把要查询是否重复的字段放入map中
                                //收银流水号
                                if(seachFields.containsKey("goodsShouyinUuidNumber")){
                                    List<String> goodsShouyinUuidNumber = seachFields.get("goodsShouyinUuidNumber");
                                    goodsShouyinUuidNumber.add(data.get(0));//要改的
                                }else{
                                    List<String> goodsShouyinUuidNumber = new ArrayList<>();
                                    goodsShouyinUuidNumber.add(data.get(0));//要改的
                                    seachFields.put("goodsShouyinUuidNumber",goodsShouyinUuidNumber);
                                }
                        }

                        //查询是否重复
                         //收银流水号
                        List<GoodsShouyinEntity> goodsShouyinEntities_goodsShouyinUuidNumber = goodsShouyinService.selectList(new EntityWrapper<GoodsShouyinEntity>().in("goods_shouyin_uuid_number", seachFields.get("goodsShouyinUuidNumber")));
                        if(goodsShouyinEntities_goodsShouyinUuidNumber.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(GoodsShouyinEntity s:goodsShouyinEntities_goodsShouyinUuidNumber){
                                repeatFields.add(s.getGoodsShouyinUuidNumber());
                            }
                            return R.error(511,"数据库的该表中的 [收银流水号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                        goodsShouyinService.insertBatch(goodsShouyinList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }





}
