package com.niuxuewei.lucius.entity.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class CreateCaseDTO {

    @NotBlank(message = "标题不能为空")
    @Size(max = 50, message = "标题最大长度为100字")
    private String title;

    @NotBlank(message = "简介不能为空")
    @Size(max = 150, message = "简介最大长度为150字")
    private String briefIntro;

    @NotBlank(message = "内容不能为空")
    private String content;

    private String demoUrl;

}
