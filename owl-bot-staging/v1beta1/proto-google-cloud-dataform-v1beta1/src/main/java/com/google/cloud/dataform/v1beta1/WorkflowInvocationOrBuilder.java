// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataform/v1beta1/dataform.proto

package com.google.cloud.dataform.v1beta1;

public interface WorkflowInvocationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataform.v1beta1.WorkflowInvocation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The workflow invocation's name.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Output only. The workflow invocation's name.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Immutable. The name of the compilation result to compile. Must be in the format
   * `projects/&#42;&#47;locations/&#42;&#47;repositories/&#42;&#47;compilationResults/&#42;`.
   * </pre>
   *
   * <code>string compilation_result = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The compilationResult.
   */
  java.lang.String getCompilationResult();
  /**
   * <pre>
   * Immutable. The name of the compilation result to compile. Must be in the format
   * `projects/&#42;&#47;locations/&#42;&#47;repositories/&#42;&#47;compilationResults/&#42;`.
   * </pre>
   *
   * <code>string compilation_result = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for compilationResult.
   */
  com.google.protobuf.ByteString
      getCompilationResultBytes();

  /**
   * <pre>
   * Immutable. If left unset, a default InvocationConfig will be used.
   * </pre>
   *
   * <code>.google.cloud.dataform.v1beta1.WorkflowInvocation.InvocationConfig invocation_config = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the invocationConfig field is set.
   */
  boolean hasInvocationConfig();
  /**
   * <pre>
   * Immutable. If left unset, a default InvocationConfig will be used.
   * </pre>
   *
   * <code>.google.cloud.dataform.v1beta1.WorkflowInvocation.InvocationConfig invocation_config = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The invocationConfig.
   */
  com.google.cloud.dataform.v1beta1.WorkflowInvocation.InvocationConfig getInvocationConfig();
  /**
   * <pre>
   * Immutable. If left unset, a default InvocationConfig will be used.
   * </pre>
   *
   * <code>.google.cloud.dataform.v1beta1.WorkflowInvocation.InvocationConfig invocation_config = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.cloud.dataform.v1beta1.WorkflowInvocation.InvocationConfigOrBuilder getInvocationConfigOrBuilder();

  /**
   * <pre>
   * Output only. This workflow invocation's current state.
   * </pre>
   *
   * <code>.google.cloud.dataform.v1beta1.WorkflowInvocation.State state = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <pre>
   * Output only. This workflow invocation's current state.
   * </pre>
   *
   * <code>.google.cloud.dataform.v1beta1.WorkflowInvocation.State state = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The state.
   */
  com.google.cloud.dataform.v1beta1.WorkflowInvocation.State getState();

  /**
   * <pre>
   * Output only. This workflow invocation's timing details.
   * </pre>
   *
   * <code>.google.type.Interval invocation_timing = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the invocationTiming field is set.
   */
  boolean hasInvocationTiming();
  /**
   * <pre>
   * Output only. This workflow invocation's timing details.
   * </pre>
   *
   * <code>.google.type.Interval invocation_timing = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The invocationTiming.
   */
  com.google.type.Interval getInvocationTiming();
  /**
   * <pre>
   * Output only. This workflow invocation's timing details.
   * </pre>
   *
   * <code>.google.type.Interval invocation_timing = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.type.IntervalOrBuilder getInvocationTimingOrBuilder();
}
