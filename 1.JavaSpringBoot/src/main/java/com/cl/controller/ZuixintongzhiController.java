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

import com.cl.entity.ZuixintongzhiEntity;
import com.cl.entity.view.ZuixintongzhiView;

import com.cl.service.ZuixintongzhiService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.EncryptUtil;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 最新通知
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-11 14:07:25
 */
@RestController
@RequestMapping("/zuixintongzhi")
public class ZuixintongzhiController {
    @Autowired
    private ZuixintongzhiService zuixintongzhiService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZuixintongzhiEntity zuixintongzhi,
		HttpServletRequest request){
        EntityWrapper<ZuixintongzhiEntity> ew = new EntityWrapper<ZuixintongzhiEntity>();

		PageUtils page = zuixintongzhiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zuixintongzhi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZuixintongzhiEntity zuixintongzhi, 
		HttpServletRequest request){
        EntityWrapper<ZuixintongzhiEntity> ew = new EntityWrapper<ZuixintongzhiEntity>();

		PageUtils page = zuixintongzhiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zuixintongzhi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZuixintongzhiEntity zuixintongzhi){
       	EntityWrapper<ZuixintongzhiEntity> ew = new EntityWrapper<ZuixintongzhiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zuixintongzhi, "zuixintongzhi")); 
        return R.ok().put("data", zuixintongzhiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZuixintongzhiEntity zuixintongzhi){
        EntityWrapper< ZuixintongzhiEntity> ew = new EntityWrapper< ZuixintongzhiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zuixintongzhi, "zuixintongzhi")); 
		ZuixintongzhiView zuixintongzhiView =  zuixintongzhiService.selectView(ew);
		return R.ok("查询最新通知成功").put("data", zuixintongzhiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZuixintongzhiEntity zuixintongzhi = zuixintongzhiService.selectById(id);
		zuixintongzhi = zuixintongzhiService.selectView(new EntityWrapper<ZuixintongzhiEntity>().eq("id", id));
        return R.ok().put("data", zuixintongzhi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZuixintongzhiEntity zuixintongzhi = zuixintongzhiService.selectById(id);
		zuixintongzhi = zuixintongzhiService.selectView(new EntityWrapper<ZuixintongzhiEntity>().eq("id", id));
        return R.ok().put("data", zuixintongzhi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZuixintongzhiEntity zuixintongzhi, HttpServletRequest request){
    	zuixintongzhi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zuixintongzhi);
        zuixintongzhiService.insert(zuixintongzhi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZuixintongzhiEntity zuixintongzhi, HttpServletRequest request){
    	zuixintongzhi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zuixintongzhi);
        zuixintongzhiService.insert(zuixintongzhi);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ZuixintongzhiEntity zuixintongzhi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zuixintongzhi);
        zuixintongzhiService.updateById(zuixintongzhi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zuixintongzhiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
