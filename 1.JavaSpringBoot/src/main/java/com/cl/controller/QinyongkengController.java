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

import com.cl.entity.QinyongkengEntity;
import com.cl.entity.view.QinyongkengView;

import com.cl.service.QinyongkengService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.EncryptUtil;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;
import com.cl.service.StoreupService;
import com.cl.entity.StoreupEntity;

/**
 * 秦俑坑
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-11 14:07:24
 */
@RestController
@RequestMapping("/qinyongkeng")
public class QinyongkengController {
    @Autowired
    private QinyongkengService qinyongkengService;

    @Autowired
    private StoreupService storeupService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,QinyongkengEntity qinyongkeng,
		HttpServletRequest request){
        EntityWrapper<QinyongkengEntity> ew = new EntityWrapper<QinyongkengEntity>();

		PageUtils page = qinyongkengService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, qinyongkeng), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,QinyongkengEntity qinyongkeng, 
		HttpServletRequest request){
        EntityWrapper<QinyongkengEntity> ew = new EntityWrapper<QinyongkengEntity>();

		PageUtils page = qinyongkengService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, qinyongkeng), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( QinyongkengEntity qinyongkeng){
       	EntityWrapper<QinyongkengEntity> ew = new EntityWrapper<QinyongkengEntity>();
      	ew.allEq(MPUtil.allEQMapPre( qinyongkeng, "qinyongkeng")); 
        return R.ok().put("data", qinyongkengService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(QinyongkengEntity qinyongkeng){
        EntityWrapper< QinyongkengEntity> ew = new EntityWrapper< QinyongkengEntity>();
 		ew.allEq(MPUtil.allEQMapPre( qinyongkeng, "qinyongkeng")); 
		QinyongkengView qinyongkengView =  qinyongkengService.selectView(ew);
		return R.ok("查询秦俑坑成功").put("data", qinyongkengView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        QinyongkengEntity qinyongkeng = qinyongkengService.selectById(id);
		qinyongkeng = qinyongkengService.selectView(new EntityWrapper<QinyongkengEntity>().eq("id", id));
        return R.ok().put("data", qinyongkeng);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        QinyongkengEntity qinyongkeng = qinyongkengService.selectById(id);
		qinyongkeng = qinyongkengService.selectView(new EntityWrapper<QinyongkengEntity>().eq("id", id));
        return R.ok().put("data", qinyongkeng);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody QinyongkengEntity qinyongkeng, HttpServletRequest request){
    	qinyongkeng.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(qinyongkeng);
        qinyongkengService.insert(qinyongkeng);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody QinyongkengEntity qinyongkeng, HttpServletRequest request){
    	qinyongkeng.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(qinyongkeng);
        qinyongkengService.insert(qinyongkeng);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody QinyongkengEntity qinyongkeng, HttpServletRequest request){
        //ValidatorUtils.validateEntity(qinyongkeng);
        qinyongkengService.updateById(qinyongkeng);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        qinyongkengService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	





    /**
     * （按值统计）
     */
    @RequestMapping("/value/{xColumnName}/{yColumnName}")
    public R value(@PathVariable("yColumnName") String yColumnName, @PathVariable("xColumnName") String xColumnName,HttpServletRequest request) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("xColumn", xColumnName);
        params.put("yColumn", yColumnName);
        EntityWrapper<QinyongkengEntity> ew = new EntityWrapper<QinyongkengEntity>();
        List<Map<String, Object>> result = qinyongkengService.selectValue(params, ew);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for(Map<String, Object> m : result) {
            for(String k : m.keySet()) {
                if(m.get(k) instanceof Date) {
                    m.put(k, sdf.format((Date)m.get(k)));
                }
            }
        }
        return R.ok().put("data", result);
    }

    /**
     * （按值统计(多)）
     */
    @RequestMapping("/valueMul/{xColumnName}")
    public R valueMul(@PathVariable("xColumnName") String xColumnName,@RequestParam String yColumnNameMul, HttpServletRequest request) {
        String[] yColumnNames = yColumnNameMul.split(",");
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("xColumn", xColumnName);
        List<List<Map<String, Object>>> result2 = new ArrayList<List<Map<String,Object>>>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        EntityWrapper<QinyongkengEntity> ew = new EntityWrapper<QinyongkengEntity>();
        for(int i=0;i<yColumnNames.length;i++) {
            params.put("yColumn", yColumnNames[i]);
            List<Map<String, Object>> result = qinyongkengService.selectValue(params, ew);
            for(Map<String, Object> m : result) {
                for(String k : m.keySet()) {
                    if(m.get(k) instanceof Date) {
                        m.put(k, sdf.format((Date)m.get(k)));
                    }
                }
            }
            result2.add(result);
        }
        return R.ok().put("data", result2);
    }

    /**
     * （按值统计）时间统计类型
     */
    @RequestMapping("/value/{xColumnName}/{yColumnName}/{timeStatType}")
    public R valueDay(@PathVariable("yColumnName") String yColumnName, @PathVariable("xColumnName") String xColumnName, @PathVariable("timeStatType") String timeStatType,HttpServletRequest request) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("xColumn", xColumnName);
        params.put("yColumn", yColumnName);
        params.put("timeStatType", timeStatType);
        EntityWrapper<QinyongkengEntity> ew = new EntityWrapper<QinyongkengEntity>();
        List<Map<String, Object>> result = qinyongkengService.selectTimeStatValue(params, ew);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for(Map<String, Object> m : result) {
            for(String k : m.keySet()) {
                if(m.get(k) instanceof Date) {
                    m.put(k, sdf.format((Date)m.get(k)));
                }
            }
        }
        return R.ok().put("data", result);
    }

    /**
     * （按值统计）时间统计类型(多)
     */
    @RequestMapping("/valueMul/{xColumnName}/{timeStatType}")
    public R valueMulDay(@PathVariable("xColumnName") String xColumnName, @PathVariable("timeStatType") String timeStatType,@RequestParam String yColumnNameMul,HttpServletRequest request) {
        String[] yColumnNames = yColumnNameMul.split(",");
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("xColumn", xColumnName);
        params.put("timeStatType", timeStatType);
        List<List<Map<String, Object>>> result2 = new ArrayList<List<Map<String,Object>>>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        EntityWrapper<QinyongkengEntity> ew = new EntityWrapper<QinyongkengEntity>();
        for(int i=0;i<yColumnNames.length;i++) {
            params.put("yColumn", yColumnNames[i]);
            List<Map<String, Object>> result = qinyongkengService.selectTimeStatValue(params, ew);
            for(Map<String, Object> m : result) {
                for(String k : m.keySet()) {
                    if(m.get(k) instanceof Date) {
                        m.put(k, sdf.format((Date)m.get(k)));
                    }
                }
            }
            result2.add(result);
        }
        return R.ok().put("data", result2);
    }

    /**
     * 分组统计
     */
    @RequestMapping("/group/{columnName}")
    public R group(@PathVariable("columnName") String columnName,HttpServletRequest request) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("column", columnName);
        EntityWrapper<QinyongkengEntity> ew = new EntityWrapper<QinyongkengEntity>();
        List<Map<String, Object>> result = qinyongkengService.selectGroup(params, ew);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for(Map<String, Object> m : result) {
            for(String k : m.keySet()) {
                if(m.get(k) instanceof Date) {
                    m.put(k, sdf.format((Date)m.get(k)));
                }
            }
        }
        return R.ok().put("data", result);
    }




    /**
     * 总数量
     */
    @RequestMapping("/count")
    public R count(@RequestParam Map<String, Object> params,QinyongkengEntity qinyongkeng, HttpServletRequest request){
        EntityWrapper<QinyongkengEntity> ew = new EntityWrapper<QinyongkengEntity>();
        int count = qinyongkengService.selectCount(MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, qinyongkeng), params), params));
        return R.ok().put("data", count);
    }


}
