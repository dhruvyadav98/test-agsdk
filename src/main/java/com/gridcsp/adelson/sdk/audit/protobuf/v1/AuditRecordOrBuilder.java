// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: audit.proto

package com.gridcsp.adelson.sdk.audit.protobuf.v1;

public interface AuditRecordOrBuilder extends
    // @@protoc_insertion_point(interface_extends:audit.v1.AuditRecord)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Id of the record.
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * Id of the record.
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * The subject (user or service) who did an action in the system
   * </pre>
   *
   * <code>string subject = 2;</code>
   * @return The subject.
   */
  java.lang.String getSubject();
  /**
   * <pre>
   * The subject (user or service) who did an action in the system
   * </pre>
   *
   * <code>string subject = 2;</code>
   * @return The bytes for subject.
   */
  com.google.protobuf.ByteString
      getSubjectBytes();

  /**
   * <pre>
   * The client machine where the subject executed the action.
   * </pre>
   *
   * <code>string machine = 3;</code>
   * @return The machine.
   */
  java.lang.String getMachine();
  /**
   * <pre>
   * The client machine where the subject executed the action.
   * </pre>
   *
   * <code>string machine = 3;</code>
   * @return The bytes for machine.
   */
  com.google.protobuf.ByteString
      getMachineBytes();

  /**
   * <pre>
   * The time when the event happened.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp event_time = 4;</code>
   * @return Whether the eventTime field is set.
   */
  boolean hasEventTime();
  /**
   * <pre>
   * The time when the event happened.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp event_time = 4;</code>
   * @return The eventTime.
   */
  com.google.protobuf.Timestamp getEventTime();
  /**
   * <pre>
   * The time when the event happened.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp event_time = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getEventTimeOrBuilder();

  /**
   * <pre>
   * The event type. (E.g., "login", "Login Successful", "Login Failed")
   * </pre>
   *
   * <code>string event_type = 5;</code>
   * @return The eventType.
   */
  java.lang.String getEventType();
  /**
   * <pre>
   * The event type. (E.g., "login", "Login Successful", "Login Failed")
   * </pre>
   *
   * <code>string event_type = 5;</code>
   * @return The bytes for eventType.
   */
  com.google.protobuf.ByteString
      getEventTypeBytes();

  /**
   * <pre>
   * The category of the event (E.g., "security", "general")
   * </pre>
   *
   * <code>string category = 6;</code>
   * @return The category.
   */
  java.lang.String getCategory();
  /**
   * <pre>
   * The category of the event (E.g., "security", "general")
   * </pre>
   *
   * <code>string category = 6;</code>
   * @return The bytes for category.
   */
  com.google.protobuf.ByteString
      getCategoryBytes();

  /**
   * <pre>
   * Optional. Any reference this event is associated with.
   * </pre>
   *
   * <code>string correlation_id = 7;</code>
   * @return The correlationId.
   */
  java.lang.String getCorrelationId();
  /**
   * <pre>
   * Optional. Any reference this event is associated with.
   * </pre>
   *
   * <code>string correlation_id = 7;</code>
   * @return The bytes for correlationId.
   */
  com.google.protobuf.ByteString
      getCorrelationIdBytes();

  /**
   * <pre>
   * Optional. Description of the event for display purpose.
   * </pre>
   *
   * <code>string description = 8;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Optional. Description of the event for display purpose.
   * </pre>
   *
   * <code>string description = 8;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Event payload
   * </pre>
   *
   * <code>.google.protobuf.Any payload = 10;</code>
   * @return Whether the payload field is set.
   */
  boolean hasPayload();
  /**
   * <pre>
   * Event payload
   * </pre>
   *
   * <code>.google.protobuf.Any payload = 10;</code>
   * @return The payload.
   */
  com.google.protobuf.Any getPayload();
  /**
   * <pre>
   * Event payload
   * </pre>
   *
   * <code>.google.protobuf.Any payload = 10;</code>
   */
  com.google.protobuf.AnyOrBuilder getPayloadOrBuilder();
}