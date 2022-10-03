// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataform/v1beta1/dataform.proto

package com.google.cloud.dataform.v1beta1;

public interface FetchFileDiffResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataform.v1beta1.FetchFileDiffResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The raw formatted Git diff for the file.
   * </pre>
   *
   * <code>string formatted_diff = 1;</code>
   * @return The formattedDiff.
   */
  java.lang.String getFormattedDiff();
  /**
   * <pre>
   * The raw formatted Git diff for the file.
   * </pre>
   *
   * <code>string formatted_diff = 1;</code>
   * @return The bytes for formattedDiff.
   */
  com.google.protobuf.ByteString
      getFormattedDiffBytes();
}
