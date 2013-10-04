/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.activiti.workflow.simple.alfresco.conversion;

import org.activiti.workflow.simple.alfresco.model.M2Namespace;

/**
 * @author Frederik Heremans
 */
public interface AlfrescoConversionConstants {

	// Content model constants
	/**
	 * Prefix for the id of created process definitions. 
	 */
	String PROCESS_ID_PREFIX = "activiti";
	
	/**
	 * Name of the shared content-model, without namespace prefix
	 */
	String CONTENT_MODEL_UNQUALIFIED_NAME = "model";
	
	/**
	 * Full namespace URL template, with {0} placeholder for the actual name
	 */
	String CONTENT_MODEL_NAMESPACE_URL = "http://www.alfresco.org/model/dynamic-workflow/{0}/1.0";
	
	M2Namespace BPM_NAMESPACE = new M2Namespace("bpm", "http://www.alfresco.org/model/bpm/1.0");
	M2Namespace DICTIONARY_NAMESPACE = new M2Namespace("d", "http://www.alfresco.org/model/dictionary/1.0");
	M2Namespace CONTENT_NAMESPACE = new M2Namespace("cm", "http://www.alfresco.org/model/content/1.0");
	
	String CONTENT_MODEL_CONSTRAINT_TYPE_LIST = "LIST";
	String CONTENT_MODEL_CONSTRAINT_ALLOWED_VALUES = "allowedValues";
	
	/**
	 * Default start form key
	 */
	String DEFAULT_START_FORM_TYPE = "bpm:startTask";
	
	/**
	 * Base type for all task models
	 */
	String DEFAULT_BASE_FORM_TYPE = "bpm:workflowTask";
	
	String PROPERTY_TYPE_TEXT = "d:text";
	String PROPERTY_TYPE_DATE = "d:date";
	String PROPERTY_TYPE_DOUBLE = "d:double";
	String PROPERTY_TYPE_DATETIME = "d:datetime";
	
	// Form constants
	/**
	 * Module id template, with {0} placeholder for unique id
	 */
	String MODULE_ID = "kickstart_form_{0}";
	
	String EVALUATOR_STRING_COMPARE = "string-compare";
	
	String FORM_SET_APPEARANCE_TITLE = "title";
	
	String FORM_SET_TEMPLATE_2_COLUMN = "/org/alfresco/components/form/2-column-set.ftl";
	
	String FORM_SET_TEMPLATE_3_COLUMN = "/org/alfresco/components/form/3-column-set.ftl";
	
	String FORM_READONLY_TEMPLATE = "/org/alfresco/components/form/controls/info.ftl";
	String FORM_MULTILINE_TEXT_TEMPLATE = "/org/alfresco/components/form/controls/textarea.ftl";
	String FORM_DATE_TEMPLATE = "/org/alfresco/components/form/controls/date.ftl";
	String FORM_DATE_PARAM_SHOW_TIME = "showTime";
	String FORM_DATE_PARAM_SUBMIT_TIME = "submitTime";
	String FORM_NUMBER_TEMPLATE = "/org/alfresco/components/form/controls/number.ftl";
	
	String FORM_GROUP_LAYOUT_1_COLUMN = "one-column";
	String FORM_GROUP_LAYOUT_2_COLUMNS = "two-column";
	String FORM_GROUP_LAYOUT_3_COLUMNS = "three-column";
	
	// Process constants
	String INITIATOR_VARIABLE = "initiatorUserName";
  String INITIATOR_ASSIGNEE_EXPRESSION = "${initiator.properties.userName}";
	
	/**
	 * Evaluator condition template, with {0} placeholder for the task/workflow key 
	 */
	String EVALUATOR_CONDITION_ACTIVITI = "activiti${0}";
	
	
	// Artifact keys
	String ARTIFACT_CONTENT_MODEL_KEY = "contentModel";
	String ARTIFACT_SHARE_CONFIG_MODULE = "configModule";
	String ARTIFACT_MODEL_NAMESPACE_PREFIX = "modelNamespacePrefix";

}