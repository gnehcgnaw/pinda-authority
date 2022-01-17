package cn.itcast.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 菜单实体
 * @author gnehcgnaw
 */
@Data
@ApiModel(value = "菜单实体",description = "菜单实体")
public class Menu {
    @ApiModelProperty(value = "主键",required = true)
    private int id;
    @ApiModelProperty(value = "菜单名称")
    private String name;
}