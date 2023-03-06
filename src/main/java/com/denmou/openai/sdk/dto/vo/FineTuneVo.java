package com.denmou.openai.sdk.dto.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * @author denmou
 * @date 2023/3/3 11:25
 */
@Data
public class FineTuneVo {
    private String id;
    private String object;
    private String model;
    @JsonProperty("created_at")
    private Long createdAt;
    @JsonProperty("fine_tuned_model")
    private String fineTunedModel;
    @JsonProperty("hyperparams")
    private HyperParamsVo hyperParams;
    @JsonProperty("organization_id")
    private String organizationId;
    @JsonProperty("result_files")
    private List<FineTuneFileVo> resultFiles;
    private String status;
    @JsonProperty("validation_files")
    private List<FineTuneFileVo> validationFiles;
    @JsonProperty("training_files")
    private List<FineTuneFileVo> trainingFiles;
    @JsonProperty("updated_at")
    private Long updatedAt;
}
