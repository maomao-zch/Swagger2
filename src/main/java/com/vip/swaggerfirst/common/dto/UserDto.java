package com.vip.swaggerfirst.common.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.util.StringUtils;

/**
 * @author vip
 * @Description: 测试接口传参实体
 * @Date 2020/2/15
 */
@Getter
@Setter
@ToString

public class UserDto {
    @ApiModelProperty(value = "用户ID")
    private Integer id;

    @ApiModelProperty(value = "用户名", required = true)
    private String username;

    @ApiModelProperty(value = "密码", required = true)
    private String password;

    public boolean checkParam() {
        return !StringUtils.isEmpty(id) && !StringUtils.isEmpty(username) && !StringUtils.isEmpty(password);
    }
}
