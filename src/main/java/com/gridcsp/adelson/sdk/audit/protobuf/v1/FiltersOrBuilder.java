// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: audit.proto

package com.gridcsp.adelson.sdk.audit.protobuf.v1;

public interface FiltersOrBuilder extends
    // @@protoc_insertion_point(interface_extends:audit.v1.Filters)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The subject (user or service) who did an action in the system
   * </pre>
   *
   * <code>string subject = 1;</code>
   * @return The subject.
   */
  java.lang.String getSubject();
  /**
   * <pre>
   * The subject (user or service) who did an action in the system
   * </pre>
   *
   * <code>string subject = 1;</code>
   * @return The bytes for subject.
   */
  com.google.protobuf.ByteString
      getSubjectBytes();

  /**
   * <pre>
   * The event type. (E.g., "login", "Login Successful", "Login Failed")
   * </pre>
   *
   * <code>string event_type = 2;</code>
   * @return The eventType.
   */
  java.lang.String getEventType();
  /**
   * <pre>
   * The event type. (E.g., "login", "Login Successful", "Login Failed")
   * </pre>
   *
   * <code>string event_type = 2;</code>
   * @return The bytes for eventType.
   */
  com.google.protobuf.ByteString
      getEventTypeBytes();

  /**
   * <pre>
   * The start date for filtering
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_date = 3;</code>
   * @return Whether the startDate field is set.
   */
  boolean hasStartDate();
  /**
   * <pre>
   * The start date for filtering
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_date = 3;</code>
   * @return The startDate.
   */
  com.google.protobuf.Timestamp getStartDate();
  /**
   * <pre>
   * The start date for filtering
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_date = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartDateOrBuilder();

  /**
   * <pre>
   * The end date for filtering
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_date = 4;</code>
   * @return Whether the endDate field is set.
   */
  boolean hasEndDate();
  /**
   * <pre>
   * The end date for filtering
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_date = 4;</code>
   * @return The endDate.
   */
  com.google.protobuf.Timestamp getEndDate();
  /**
   * <pre>
   * The end date for filtering
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_date = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndDateOrBuilder();

  /**
   * <pre>
   * Ip address of the machine
   * </pre>
   *
   * <code>string source = 5;</code>
   * @return The source.
   */
  java.lang.String getSource();
  /**
   * <pre>
   * Ip address of the machine
   * </pre>
   *
   * <code>string source = 5;</code>
   * @return The bytes for source.
   */
  com.google.protobuf.ByteString
      getSourceBytes();
}
