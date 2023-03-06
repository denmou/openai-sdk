package com.denmou.openai.sdk.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * @author denmou
 * @date 2023/3/3 16:01
 */
@Data
@Builder
public class FineTuneCreateRequest implements OpenAiRequest {
    /**
     * training_file string Required<p>
     * The ID of an uploaded file that contains training data.<p>
     * See <a href="https://platform.openai.com/docs/api-reference/files/upload">upload file</a> for how to upload a file.<p>
     * Your dataset must be formatted as a JSONL file, where each training example is a JSON object with the keys "prompt" and "completion". Additionally, you must upload your file with the purpose fine-tune.<p>
     * See the <a href="https://platform.openai.com/docs/guides/fine-tuning/creating-training-data">fine-tuning guide</a> for more details.
     **/
    @JsonProperty("training_file")
    private String trainingFile;
    /**
     * validation_file string Optional<p>
     * The ID of an uploaded file that contains validation data.<p>
     * If you provide this file, the data is used to generate validation metrics periodically during fine-tuning. These metrics can be viewed in the <a href="https://platform.openai.com/docs/guides/fine-tuning/analyzing-your-fine-tuned-model">fine-tuning results file</>. Your train and validation data should be mutually exclusive.<p>
     * Your dataset must be formatted as a JSONL file, where each validation example is a JSON object with the keys "prompt" and "completion". Additionally, you must upload your file with the purpose fine-tune.<p>
     * See the <a href="https://platform.openai.com/docs/guides/fine-tuning/creating-training-data">fine-tuning guide</a> for more details.
     **/
    @JsonProperty("validation_file")
    private String validationFile;
    /**
     * model string Optional Defaults to curie<p>
     * The name of the base model to fine-tune. You can select one of "ada", "babbage", "curie", "davinci", or a fine-tuned model created after 2022-04-21. To learn more about these models, see the <a href="https://platform.openai.com/docs/models">Models</a> documentation.
     **/
    private String model;
    /**
     * n_epochs integer Optional Defaults to 4<p>
     * The number of epochs to train the model for. An epoch refers to one full cycle through the training dataset.
     **/
    @JsonProperty("n_epochs")
    private Double nEpochs;
    /**
     * batch_size integer Optional Defaults to null<p>
     * The batch size to use for training. The batch size is the number of training examples used to train a single forward and backward pass.<p>
     * By default, the batch size will be dynamically configured to be ~0.2% of the number of examples in the training set, capped at 256 - in general, we've found that larger batch sizes tend to work better for larger datasets.
     **/
    @JsonProperty("batch_size")
    private Integer batchSize;
    /**
     * learning_rate_multiplier number Optional Defaults to null<p>
     * The learning rate multiplier to use for training. The fine-tuning learning rate is the original learning rate used for pretraining multiplied by this value.<p>
     * By default, the learning rate multiplier is the 0.05, 0.1, or 0.2 depending on final batch_size (larger learning rates tend to perform better with larger batch sizes). We recommend experimenting with values in the range 0.02 to 0.2 to see what produces the best results.
     **/
    @JsonProperty("learning_rate_multiplier")
    private Double learningRateMultiplier;
    /**
     * prompt_loss_weight number Optional Defaults to 0.01<p>
     * The weight to use for loss on the prompt tokens. This controls how much the model tries to learn to generate the prompt (as compared to the completion which always has a weight of 1.0), and can add a stabilizing effect to training when completions are short.<p>
     * If prompts are extremely long (relative to completions), it may make sense to reduce this weight so as to avoid over-prioritizing learning the prompt.
     **/
    @JsonProperty("prompt_loss_weight")
    private Double promptLossWeight;
    /**
     * compute_classification_metrics boolean Optional Defaults to false<p>
     * If set, we calculate classification-specific metrics such as accuracy and F-1 score using the validation set at the end of every epoch. These metrics can be viewed in the <a href="https://platform.openai.com/docs/guides/fine-tuning/analyzing-your-fine-tuned-model">results file</a>.<p>
     * In order to compute classification metrics, you must provide a validation_file. Additionally, you must specify classification_n_classes for multiclass classification or classification_positive_class for binary classification.
     **/
    @JsonProperty("compute_classification_metrics")
    private Boolean computeClassificationMetrics;
    /**
     * classification_n_classes integer Optional Defaults to null<p>
     * The number of classes in a classification task.<p>
     * This parameter is required for multiclass classification.
     **/
    @JsonProperty("classification_n_classes")
    private Integer classificationNumberClasses;
    /**
     * classification_positive_class string Optional Defaults to null<p>
     * The positive class in binary classification. <p>
     * This parameter is needed to generate precision, recall, and F1 metrics when doing binary classification.
     **/
    @JsonProperty("classification_positive_class")
    private String classificationPositiveClass;
    /**
     * classification_betas array Optional Defaults to null<p>
     * If this is provided, we calculate F-beta scores at the specified beta values. The F-beta score is a generalization of F-1 score. This is only used for binary classification.<p>
     * With a beta of 1 (i.e. the F-1 score), precision and recall are given the same weight. A larger beta score puts more weight on recall and less on precision. A smaller beta score puts more weight on precision and less on recall.
     **/
    @JsonProperty("classification_betas")
    private List<Object> classificationBetas;
    /**
     * suffix string Optional Defaults to null<p>
     * A string of up to 40 characters that will be added to your fine-tuned model name.<p>
     * For example, a suffix of "custom-model-name" would produce a model name like ada:ft-your-org:custom-model-name-2022-02-15-04-21-04.
     **/
    private String suffix;
}
