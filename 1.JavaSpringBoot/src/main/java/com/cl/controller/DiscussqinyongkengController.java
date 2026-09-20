package com.cl.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.cl.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.cl.annotation.IgnoreAuth;

import com.cl.entity.DiscussqinyongkengEntity;
import com.cl.entity.view.DiscussqinyongkengView;

import com.cl.service.DiscussqinyongkengService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.EncryptUtil;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 秦俑坑评论表
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-11 14:07:25
 */
@RestController
@RequestMapping("/discussqinyongkeng")
public class DiscussqinyongkengController {
    @Autowired
    private DiscussqinyongkengService discussqinyongkengService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DiscussqinyongkengEntity discussqinyongkeng,
		HttpServletRequest request){
        EntityWrapper<DiscussqinyongkengEntity> ew = new EntityWrapper<DiscussqinyongkengEntity>();

		PageUtils page = discussqinyongkengService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussqinyongkeng), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DiscussqinyongkengEntity discussqinyongkeng, 
		HttpServletRequest request){
        EntityWrapper<DiscussqinyongkengEntity> ew = new EntityWrapper<DiscussqinyongkengEntity>();

		PageUtils page = discussqinyongkengService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussqinyongkeng), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DiscussqinyongkengEntity discussqinyongkeng){
       	EntityWrapper<DiscussqinyongkengEntity> ew = new EntityWrapper<DiscussqinyongkengEntity>();
      	ew.allEq(MPUtil.allEQMapPre( discussqinyongkeng, "discussqinyongkeng")); 
        return R.ok().put("data", discussqinyongkengService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DiscussqinyongkengEntity discussqinyongkeng){
        EntityWrapper< DiscussqinyongkengEntity> ew = new EntityWrapper< DiscussqinyongkengEntity>();
 		ew.allEq(MPUtil.allEQMapPre( discussqinyongkeng, "discussqinyongkeng")); 
		DiscussqinyongkengView discussqinyongkengView =  discussqinyongkengService.selectView(ew);
		return R.ok("查询秦俑坑评论表成功").put("data", discussqinyongkengView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DiscussqinyongkengEntity discussqinyongkeng = discussqinyongkengService.selectById(id);
		discussqinyongkeng = discussqinyongkengService.selectView(new EntityWrapper<DiscussqinyongkengEntity>().eq("id", id));
        return R.ok().put("data", discussqinyongkeng);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DiscussqinyongkengEntity discussqinyongkeng = discussqinyongkengService.selectById(id);
		discussqinyongkeng = discussqinyongkengService.selectView(new EntityWrapper<DiscussqinyongkengEntity>().eq("id", id));
        return R.ok().put("data", discussqinyongkeng);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DiscussqinyongkengEntity discussqinyongkeng, HttpServletRequest request){
    	discussqinyongkeng.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discussqinyongkeng);
        discussqinyongkengService.insert(discussqinyongkeng);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DiscussqinyongkengEntity discussqinyongkeng, HttpServletRequest request){
    	discussqinyongkeng.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discussqinyongkeng);
        discussqinyongkengService.insert(discussqinyongkeng);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    @IgnoreAuth
    public R update(@RequestBody DiscussqinyongkengEntity discussqinyongkeng, HttpServletRequest request){
        //ValidatorUtils.validateEntity(discussqinyongkeng);
        discussqinyongkengService.updateById(discussqinyongkeng);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        discussqinyongkengService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,DiscussqinyongkengEntity discussqinyongkeng, HttpServletRequest request,String pre){
        EntityWrapper<DiscussqinyongkengEntity> ew = new EntityWrapper<DiscussqinyongkengEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicktime");
        params.put("order", "desc");
		PageUtils page = discussqinyongkengService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussqinyongkeng), params), params));
        return R.ok().put("data", page);
    }








}
