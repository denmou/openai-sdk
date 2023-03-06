package com.denmou.openai.sdk.dto.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author denmou
 * @date 2023/3/3 11:23
 */
@Data
public class HyperParamsVo {
    @JsonProperty("batch_size")
    private Integer batchSize;
    @JsonProperty("learning_rate_multiplier")
    private Float learningRateMultiplier;
    @JsonProperty("n_epochs")
    private Integer nEpochs;
    @JsonProperty("prompt_loss_weight")
    private Float promptLossWeight;
}
