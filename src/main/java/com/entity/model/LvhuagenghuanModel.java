package com.entity.model;

import com.entity.LvhuagenghuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 绿化更换
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class LvhuagenghuanModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 负责人
     */
    private Integer yonghuId;


    /**
     * 绿化区域
     */
    private String lvhuagenghuanName;


    /**
     * 季节
     */
    private String lvhuagenghuanJijie;


    /**
     * 植被
     */
    private String lvhuagenghuanZhibei;


    /**
     * 备注
     */
    private String lvhuagenghuanContent;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：负责人
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：负责人
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：绿化区域
	 */
    public String getLvhuagenghuanName() {
        return lvhuagenghuanName;
    }


    /**
	 * 设置：绿化区域
	 */
    public void setLvhuagenghuanName(String lvhuagenghuanName) {
        this.lvhuagenghuanName = lvhuagenghuanName;
    }
    /**
	 * 获取：季节
	 */
    public String getLvhuagenghuanJijie() {
        return lvhuagenghuanJijie;
    }


    /**
	 * 设置：季节
	 */
    public void setLvhuagenghuanJijie(String lvhuagenghuanJijie) {
        this.lvhuagenghuanJijie = lvhuagenghuanJijie;
    }
    /**
	 * 获取：植被
	 */
    public String getLvhuagenghuanZhibei() {
        return lvhuagenghuanZhibei;
    }


    /**
	 * 设置：植被
	 */
    public void setLvhuagenghuanZhibei(String lvhuagenghuanZhibei) {
        this.lvhuagenghuanZhibei = lvhuagenghuanZhibei;
    }
    /**
	 * 获取：备注
	 */
    public String getLvhuagenghuanContent() {
        return lvhuagenghuanContent;
    }


    /**
	 * 设置：备注
	 */
    public void setLvhuagenghuanContent(String lvhuagenghuanContent) {
        this.lvhuagenghuanContent = lvhuagenghuanContent;
    }
    /**
	 * 获取：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：添加时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
