package com.hello.model.entity;

import java.math.BigDecimal;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 订单表
 * </p>
 *
 * @author xjliu
 * @since 2021-07-05
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value="Order对象", description="订单表")
public class Order extends Model {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "ID")
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    @ApiModelProperty(value = "用户id")
    private Long userId;

    @ApiModelProperty(value = "价格")
    private BigDecimal price;

    @ApiModelProperty(value = "个数")
    private Integer num;

    @ApiModelProperty(value = "version")
    private Integer version;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "最后更新时间")
    @TableField(value = "update_time")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "逻辑删除（0 未删除、1 删除）")
    private Boolean deleteFlag;


}
