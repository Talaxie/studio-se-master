// ============================================================================
//
// Copyright (C) 2006-2022 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.core.pendo.properties;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DOC jding  class global comment. Detailled comment
 */
public class PendoTMapProperties implements IPendoDataProperties {

    /**
     * Number of input columns
     */
    @JsonProperty("input_columns")
    private int inputColumns;

    /**
     * Number of output columns
     */
    @JsonProperty("output_columns")
    private int outputColumns;

    /**
     * Number of var columns
     */
    @JsonProperty("var_columns")
    private int varColumns;

    /**
     * Number of input tables which have at least 1 mapping to an output table
     */
    @JsonProperty("number_of_sources")
    private int sourceNumber;

    /**
     * Number of output tables have mapping from the main input table 
     */
    @JsonProperty("number_of_destinations")
    private int destinationNumber;

    /**
     * Number of output tables
     */
    @JsonProperty("number_of_outputs")
    private int outputNumber;

    /**
     * Number of expressions without java transformation(expressions in input_columns/var_columns/output_columns but not
     * include filter expressions)
     */
    @JsonProperty("simple_expressions")
    private int simpleExpressions;

    /**
     * Number of expressions with java transformation(expressions in input_columns/var_columns/output_columns but not
     * include filter expressions)
     */
    @JsonProperty("transformed_expressions")
    private int transformExpressions;

    /**
     * Number of mappings(links) between input and var
     */
    @JsonProperty("input_var_mapping")
    private int inputVarMappings;

    /**
     * Number of mappings(links) between var and output
     */
    @JsonProperty("var_output_mapping")
    private int varOutputMappings;

    /**
     * Number of mappings(links) between input and output
     */
    @JsonProperty("input_output_mapping")
    private int inputOutputMappings;

    /**
     * Number of input columns which are mapped to multiple output columns, either mapped directly or mapped through the
     * Var column
     */
    @JsonProperty("mapping_1_to_n")
    private int oneToNMappings;

    /**
     * Number of output columns which have multiple source columns, either input columns or var columns
     */
    @JsonProperty("mapping_n_to_1")
    private int nToOneMappings;

    /**
     * Number of mappings(links) between main input table and join tables
     */
    @JsonProperty("join_mappings")
    private int joinMappingCounts;

    /**
     * Number of left out join used in join table
     */
    @JsonProperty("left_joins")
    private int leftJoinCounts;

    /**
     * Number of inner join used in join table
     */
    @JsonProperty("inner_joins")
    private int innerJoinCounts;

    /**
     * Number of filter activated on input/output tables  
     */
    @JsonProperty("filters")
    private int filterCounts;

    /**
     * Number of field types for each type in OUTPUT tables
     */
    @JsonProperty("field_types")
    private String outputFieldTypes;


    /**
     * Getter for inputColumns.
     * @return the inputColumns
     */
    public int getInputColumns() {
        return inputColumns;
    }


    /**
     * Sets the inputColumns.
     * @param inputColumns the inputColumns to set
     */
    public void setInputColumns(int inputColumns) {
        this.inputColumns = inputColumns;
    }


    /**
     * Getter for outputColumns.
     * @return the outputColumns
     */
    public int getOutputColumns() {
        return outputColumns;
    }


    /**
     * Sets the outputColumns.
     * @param outputColumns the outputColumns to set
     */
    public void setOutputColumns(int outputColumns) {
        this.outputColumns = outputColumns;
    }


    /**
     * Getter for varColumns.
     * @return the varColumns
     */
    public int getVarColumns() {
        return varColumns;
    }


    /**
     * Sets the varColumns.
     * @param varColumns the varColumns to set
     */
    public void setVarColumns(int varColumns) {
        this.varColumns = varColumns;
    }


    /**
     * Getter for sourceNumber.
     * @return the sourceNumber
     */
    public int getSourceNumber() {
        return sourceNumber;
    }


    /**
     * Sets the sourceNumber.
     * @param sourceNumber the sourceNumber to set
     */
    public void setSourceNumber(int sourceNumber) {
        this.sourceNumber = sourceNumber;
    }


    /**
     * Getter for destinationNumber.
     * @return the destinationNumber
     */
    public int getDestinationNumber() {
        return destinationNumber;
    }


    /**
     * Sets the destinationNumber.
     * @param destinationNumber the destinationNumber to set
     */
    public void setDestinationNumber(int destinationNumber) {
        this.destinationNumber = destinationNumber;
    }


    /**
     * Getter for outputNumber.
     * @return the outputNumber
     */
    public int getOutputNumber() {
        return outputNumber;
    }


    /**
     * Sets the outputNumber.
     * @param outputNumber the outputNumber to set
     */
    public void setOutputNumber(int outputNumber) {
        this.outputNumber = outputNumber;
    }


    /**
     * Getter for simpleExpressions.
     * 
     * @return the simpleExpressions
     */
    public int getSimpleExpressions() {
        return simpleExpressions;
    }


    /**
     * Sets the simpleExpressions.
     * 
     * @param simpleExpressions the simpleExpressions to set
     */
    public void setSimpleExpressions(int simpleExpressions) {
        this.simpleExpressions = simpleExpressions;
    }


    /**
     * Getter for transformExpressions.
     * 
     * @return the transformExpressions
     */
    public int getTransformExpressions() {
        return transformExpressions;
    }


    /**
     * Sets the transformExpressions.
     * 
     * @param transformExpressions the transformExpressions to set
     */
    public void setTransformExpressions(int transformExpressions) {
        this.transformExpressions = transformExpressions;
    }


    /**
     * Getter for inputVarMappings.
     * @return the inputVarMappings
     */
    public int getInputVarMappings() {
        return inputVarMappings;
    }


    /**
     * Sets the inputVarMappings.
     * @param inputVarMappings the inputVarMappings to set
     */
    public void setInputVarMappings(int inputVarMappings) {
        this.inputVarMappings = inputVarMappings;
    }


    /**
     * Getter for varOutputMappings.
     * @return the varOutputMappings
     */
    public int getVarOutputMappings() {
        return varOutputMappings;
    }


    /**
     * Sets the varOutputMappings.
     * @param varOutputMappings the varOutputMappings to set
     */
    public void setVarOutputMappings(int varOutputMappings) {
        this.varOutputMappings = varOutputMappings;
    }


    /**
     * Getter for inputOutputMappings.
     * @return the inputOutputMappings
     */
    public int getInputOutputMappings() {
        return inputOutputMappings;
    }


    /**
     * Sets the inputOutputMappings.
     * @param inputOutputMappings the inputOutputMappings to set
     */
    public void setInputOutputMappings(int inputOutputMappings) {
        this.inputOutputMappings = inputOutputMappings;
    }


    /**
     * Getter for oneToNMappings.
     * @return the oneToNMappings
     */
    public int getOneToNMappings() {
        return oneToNMappings;
    }


    /**
     * Sets the oneToNMappings.
     * @param oneToNMappings the oneToNMappings to set
     */
    public void setOneToNMappings(int oneToNMappings) {
        this.oneToNMappings = oneToNMappings;
    }


    /**
     * Getter for nToOneMappings.
     * @return the nToOneMappings
     */
    public int getnToOneMappings() {
        return nToOneMappings;
    }


    /**
     * Sets the nToOneMappings.
     * @param nToOneMappings the nToOneMappings to set
     */
    public void setnToOneMappings(int nToOneMappings) {
        this.nToOneMappings = nToOneMappings;
    }


    /**
     * Getter for joinMappingCounts.
     * @return the joinMappingCounts
     */
    public int getJoinMappingCounts() {
        return joinMappingCounts;
    }


    /**
     * Sets the joinMappingCounts.
     * @param joinMappingCounts the joinMappingCounts to set
     */
    public void setJoinMappingCounts(int joinMappingCounts) {
        this.joinMappingCounts = joinMappingCounts;
    }


    /**
     * Getter for leftJoinCounts.
     * @return the leftJoinCounts
     */
    public int getLeftJoinCounts() {
        return leftJoinCounts;
    }


    /**
     * Sets the leftJoinCounts.
     * @param leftJoinCounts the leftJoinCounts to set
     */
    public void setLeftJoinCounts(int leftJoinCounts) {
        this.leftJoinCounts = leftJoinCounts;
    }


    /**
     * Getter for innerJoinCounts.
     * @return the innerJoinCounts
     */
    public int getInnerJoinCounts() {
        return innerJoinCounts;
    }


    /**
     * Sets the innerJoinCounts.
     * @param innerJoinCounts the innerJoinCounts to set
     */
    public void setInnerJoinCounts(int innerJoinCounts) {
        this.innerJoinCounts = innerJoinCounts;
    }


    /**
     * Getter for filterCounts.
     * @return the filterCounts
     */
    public int getFilterCounts() {
        return filterCounts;
    }


    /**
     * Sets the filterCounts.
     * @param filterCounts the filterCounts to set
     */
    public void setFilterCounts(int filterCounts) {
        this.filterCounts = filterCounts;
    }


    /**
     * Getter for outputFieldTypes.
     * @return the outputFieldTypes
     */
    public String getOutputFieldTypes() {
        return outputFieldTypes;
    }


    /**
     * Sets the outputFieldTypes.
     * @param outputFieldTypes the outputFieldTypes to set
     */
    public void setOutputFieldTypes(String outputFieldTypes) {
        this.outputFieldTypes = outputFieldTypes;
    }


}
