// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: audit.proto

package com.gridcsp.adelson.sdk.audit.protobuf.v1;

/**
 * <pre>
 * Audit record search request.
 * </pre>
 *
 * Protobuf type {@code audit.v1.SearchRequest}
 */
public final class SearchRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:audit.v1.SearchRequest)
    SearchRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SearchRequest.newBuilder() to construct.
  private SearchRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SearchRequest() {
    orderBy_ = "";
    pageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SearchRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SearchRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            com.gridcsp.adelson.sdk.audit.protobuf.v1.Filters.Builder subBuilder = null;
            if (filter_ != null) {
              subBuilder = filter_.toBuilder();
            }
            filter_ = input.readMessage(com.gridcsp.adelson.sdk.audit.protobuf.v1.Filters.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(filter_);
              filter_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {

            pageSize_ = input.readInt32();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            orderBy_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            pageToken_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.gridcsp.adelson.sdk.audit.protobuf.v1.AuditProto.internal_static_audit_v1_SearchRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.gridcsp.adelson.sdk.audit.protobuf.v1.AuditProto.internal_static_audit_v1_SearchRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.gridcsp.adelson.sdk.audit.protobuf.v1.SearchRequest.class, com.gridcsp.adelson.sdk.audit.protobuf.v1.SearchRequest.Builder.class);
  }

  public static final int FILTER_FIELD_NUMBER = 1;
  private com.gridcsp.adelson.sdk.audit.protobuf.v1.Filters filter_;
  /**
   * <pre>
   * Optional. A filter that chooses which audit records are returned.
   * </pre>
   *
   * <code>.audit.v1.Filters filter = 1;</code>
   * @return Whether the filter field is set.
   */
  @java.lang.Override
  public boolean hasFilter() {
    return filter_ != null;
  }
  /**
   * <pre>
   * Optional. A filter that chooses which audit records are returned.
   * </pre>
   *
   * <code>.audit.v1.Filters filter = 1;</code>
   * @return The filter.
   */
  @java.lang.Override
  public com.gridcsp.adelson.sdk.audit.protobuf.v1.Filters getFilter() {
    return filter_ == null ? com.gridcsp.adelson.sdk.audit.protobuf.v1.Filters.getDefaultInstance() : filter_;
  }
  /**
   * <pre>
   * Optional. A filter that chooses which audit records are returned.
   * </pre>
   *
   * <code>.audit.v1.Filters filter = 1;</code>
   */
  @java.lang.Override
  public com.gridcsp.adelson.sdk.audit.protobuf.v1.FiltersOrBuilder getFilterOrBuilder() {
    return getFilter();
  }

  public static final int PAGE_SIZE_FIELD_NUMBER = 2;
  private int pageSize_;
  /**
   * <pre>
   * Optional. The maximum number of results to return from this request. Default is 25.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   * @return The pageSize.
   */
  @java.lang.Override
  public int getPageSize() {
    return pageSize_;
  }

  public static final int ORDER_BY_FIELD_NUMBER = 3;
  private volatile java.lang.Object orderBy_;
  /**
   * <pre>
   * Optional. E.g., reverse chronological order of event_time
   * </pre>
   *
   * <code>string order_by = 3;</code>
   * @return The orderBy.
   */
  @java.lang.Override
  public java.lang.String getOrderBy() {
    java.lang.Object ref = orderBy_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      orderBy_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Optional. E.g., reverse chronological order of event_time
   * </pre>
   *
   * <code>string order_by = 3;</code>
   * @return The bytes for orderBy.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOrderByBytes() {
    java.lang.Object ref = orderBy_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      orderBy_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PAGE_TOKEN_FIELD_NUMBER = 4;
  private volatile java.lang.Object pageToken_;
  /**
   * <pre>
   * Optional. If present, then retrieve the next batch of results from the preceding call
   * to this request.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   * @return The pageToken.
   */
  @java.lang.Override
  public java.lang.String getPageToken() {
    java.lang.Object ref = pageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Optional. If present, then retrieve the next batch of results from the preceding call
   * to this request.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   * @return The bytes for pageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPageTokenBytes() {
    java.lang.Object ref = pageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      pageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (filter_ != null) {
      output.writeMessage(1, getFilter());
    }
    if (pageSize_ != 0) {
      output.writeInt32(2, pageSize_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(orderBy_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, orderBy_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, pageToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (filter_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getFilter());
    }
    if (pageSize_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, pageSize_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(orderBy_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, orderBy_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, pageToken_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.gridcsp.adelson.sdk.audit.protobuf.v1.SearchRequest)) {
      return super.equals(obj);
    }
    com.gridcsp.adelson.sdk.audit.protobuf.v1.SearchRequest other = (com.gridcsp.adelson.sdk.audit.protobuf.v1.SearchRequest) obj;

    if (hasFilter() != other.hasFilter()) return false;
    if (hasFilter()) {
      if (!getFilter()
          .equals(other.getFilter())) return false;
    }
    if (getPageSize()
        != other.getPageSize()) return false;
    if (!getOrderBy()
        .equals(other.getOrderBy())) return false;
    if (!getPageToken()
        .equals(other.getPageToken())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasFilter()) {
      hash = (37 * hash) + FILTER_FIELD_NUMBER;
      hash = (53 * hash) + getFilter().hashCode();
    }
    hash = (37 * hash) + PAGE_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getPageSize();
    hash = (37 * hash) + ORDER_BY_FIELD_NUMBER;
    hash = (53 * hash) + getOrderBy().hashCode();
    hash = (37 * hash) + PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.gridcsp.adelson.sdk.audit.protobuf.v1.SearchRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gridcsp.adelson.sdk.audit.protobuf.v1.SearchRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gridcsp.adelson.sdk.audit.protobuf.v1.SearchRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gridcsp.adelson.sdk.audit.protobuf.v1.SearchRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gridcsp.adelson.sdk.audit.protobuf.v1.SearchRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gridcsp.adelson.sdk.audit.protobuf.v1.SearchRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gridcsp.adelson.sdk.audit.protobuf.v1.SearchRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.gridcsp.adelson.sdk.audit.protobuf.v1.SearchRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.gridcsp.adelson.sdk.audit.protobuf.v1.SearchRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.gridcsp.adelson.sdk.audit.protobuf.v1.SearchRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.gridcsp.adelson.sdk.audit.protobuf.v1.SearchRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.gridcsp.adelson.sdk.audit.protobuf.v1.SearchRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.gridcsp.adelson.sdk.audit.protobuf.v1.SearchRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Audit record search request.
   * </pre>
   *
   * Protobuf type {@code audit.v1.SearchRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:audit.v1.SearchRequest)
      com.gridcsp.adelson.sdk.audit.protobuf.v1.SearchRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.gridcsp.adelson.sdk.audit.protobuf.v1.AuditProto.internal_static_audit_v1_SearchRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.gridcsp.adelson.sdk.audit.protobuf.v1.AuditProto.internal_static_audit_v1_SearchRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.gridcsp.adelson.sdk.audit.protobuf.v1.SearchRequest.class, com.gridcsp.adelson.sdk.audit.protobuf.v1.SearchRequest.Builder.class);
    }

    // Construct using com.gridcsp.adelson.sdk.audit.protobuf.v1.SearchRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (filterBuilder_ == null) {
        filter_ = null;
      } else {
        filter_ = null;
        filterBuilder_ = null;
      }
      pageSize_ = 0;

      orderBy_ = "";

      pageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.gridcsp.adelson.sdk.audit.protobuf.v1.AuditProto.internal_static_audit_v1_SearchRequest_descriptor;
    }

    @java.lang.Override
    public com.gridcsp.adelson.sdk.audit.protobuf.v1.SearchRequest getDefaultInstanceForType() {
      return com.gridcsp.adelson.sdk.audit.protobuf.v1.SearchRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.gridcsp.adelson.sdk.audit.protobuf.v1.SearchRequest build() {
      com.gridcsp.adelson.sdk.audit.protobuf.v1.SearchRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.gridcsp.adelson.sdk.audit.protobuf.v1.SearchRequest buildPartial() {
      com.gridcsp.adelson.sdk.audit.protobuf.v1.SearchRequest result = new com.gridcsp.adelson.sdk.audit.protobuf.v1.SearchRequest(this);
      if (filterBuilder_ == null) {
        result.filter_ = filter_;
      } else {
        result.filter_ = filterBuilder_.build();
      }
      result.pageSize_ = pageSize_;
      result.orderBy_ = orderBy_;
      result.pageToken_ = pageToken_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.gridcsp.adelson.sdk.audit.protobuf.v1.SearchRequest) {
        return mergeFrom((com.gridcsp.adelson.sdk.audit.protobuf.v1.SearchRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.gridcsp.adelson.sdk.audit.protobuf.v1.SearchRequest other) {
      if (other == com.gridcsp.adelson.sdk.audit.protobuf.v1.SearchRequest.getDefaultInstance()) return this;
      if (other.hasFilter()) {
        mergeFilter(other.getFilter());
      }
      if (other.getPageSize() != 0) {
        setPageSize(other.getPageSize());
      }
      if (!other.getOrderBy().isEmpty()) {
        orderBy_ = other.orderBy_;
        onChanged();
      }
      if (!other.getPageToken().isEmpty()) {
        pageToken_ = other.pageToken_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.gridcsp.adelson.sdk.audit.protobuf.v1.SearchRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.gridcsp.adelson.sdk.audit.protobuf.v1.SearchRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.gridcsp.adelson.sdk.audit.protobuf.v1.Filters filter_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.gridcsp.adelson.sdk.audit.protobuf.v1.Filters, com.gridcsp.adelson.sdk.audit.protobuf.v1.Filters.Builder, com.gridcsp.adelson.sdk.audit.protobuf.v1.FiltersOrBuilder> filterBuilder_;
    /**
     * <pre>
     * Optional. A filter that chooses which audit records are returned.
     * </pre>
     *
     * <code>.audit.v1.Filters filter = 1;</code>
     * @return Whether the filter field is set.
     */
    public boolean hasFilter() {
      return filterBuilder_ != null || filter_ != null;
    }
    /**
     * <pre>
     * Optional. A filter that chooses which audit records are returned.
     * </pre>
     *
     * <code>.audit.v1.Filters filter = 1;</code>
     * @return The filter.
     */
    public com.gridcsp.adelson.sdk.audit.protobuf.v1.Filters getFilter() {
      if (filterBuilder_ == null) {
        return filter_ == null ? com.gridcsp.adelson.sdk.audit.protobuf.v1.Filters.getDefaultInstance() : filter_;
      } else {
        return filterBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Optional. A filter that chooses which audit records are returned.
     * </pre>
     *
     * <code>.audit.v1.Filters filter = 1;</code>
     */
    public Builder setFilter(com.gridcsp.adelson.sdk.audit.protobuf.v1.Filters value) {
      if (filterBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        filter_ = value;
        onChanged();
      } else {
        filterBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Optional. A filter that chooses which audit records are returned.
     * </pre>
     *
     * <code>.audit.v1.Filters filter = 1;</code>
     */
    public Builder setFilter(
        com.gridcsp.adelson.sdk.audit.protobuf.v1.Filters.Builder builderForValue) {
      if (filterBuilder_ == null) {
        filter_ = builderForValue.build();
        onChanged();
      } else {
        filterBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Optional. A filter that chooses which audit records are returned.
     * </pre>
     *
     * <code>.audit.v1.Filters filter = 1;</code>
     */
    public Builder mergeFilter(com.gridcsp.adelson.sdk.audit.protobuf.v1.Filters value) {
      if (filterBuilder_ == null) {
        if (filter_ != null) {
          filter_ =
            com.gridcsp.adelson.sdk.audit.protobuf.v1.Filters.newBuilder(filter_).mergeFrom(value).buildPartial();
        } else {
          filter_ = value;
        }
        onChanged();
      } else {
        filterBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Optional. A filter that chooses which audit records are returned.
     * </pre>
     *
     * <code>.audit.v1.Filters filter = 1;</code>
     */
    public Builder clearFilter() {
      if (filterBuilder_ == null) {
        filter_ = null;
        onChanged();
      } else {
        filter_ = null;
        filterBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Optional. A filter that chooses which audit records are returned.
     * </pre>
     *
     * <code>.audit.v1.Filters filter = 1;</code>
     */
    public com.gridcsp.adelson.sdk.audit.protobuf.v1.Filters.Builder getFilterBuilder() {
      
      onChanged();
      return getFilterFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Optional. A filter that chooses which audit records are returned.
     * </pre>
     *
     * <code>.audit.v1.Filters filter = 1;</code>
     */
    public com.gridcsp.adelson.sdk.audit.protobuf.v1.FiltersOrBuilder getFilterOrBuilder() {
      if (filterBuilder_ != null) {
        return filterBuilder_.getMessageOrBuilder();
      } else {
        return filter_ == null ?
            com.gridcsp.adelson.sdk.audit.protobuf.v1.Filters.getDefaultInstance() : filter_;
      }
    }
    /**
     * <pre>
     * Optional. A filter that chooses which audit records are returned.
     * </pre>
     *
     * <code>.audit.v1.Filters filter = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.gridcsp.adelson.sdk.audit.protobuf.v1.Filters, com.gridcsp.adelson.sdk.audit.protobuf.v1.Filters.Builder, com.gridcsp.adelson.sdk.audit.protobuf.v1.FiltersOrBuilder> 
        getFilterFieldBuilder() {
      if (filterBuilder_ == null) {
        filterBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.gridcsp.adelson.sdk.audit.protobuf.v1.Filters, com.gridcsp.adelson.sdk.audit.protobuf.v1.Filters.Builder, com.gridcsp.adelson.sdk.audit.protobuf.v1.FiltersOrBuilder>(
                getFilter(),
                getParentForChildren(),
                isClean());
        filter_ = null;
      }
      return filterBuilder_;
    }

    private int pageSize_ ;
    /**
     * <pre>
     * Optional. The maximum number of results to return from this request. Default is 25.
     * </pre>
     *
     * <code>int32 page_size = 2;</code>
     * @return The pageSize.
     */
    @java.lang.Override
    public int getPageSize() {
      return pageSize_;
    }
    /**
     * <pre>
     * Optional. The maximum number of results to return from this request. Default is 25.
     * </pre>
     *
     * <code>int32 page_size = 2;</code>
     * @param value The pageSize to set.
     * @return This builder for chaining.
     */
    public Builder setPageSize(int value) {
      
      pageSize_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. The maximum number of results to return from this request. Default is 25.
     * </pre>
     *
     * <code>int32 page_size = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPageSize() {
      
      pageSize_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object orderBy_ = "";
    /**
     * <pre>
     * Optional. E.g., reverse chronological order of event_time
     * </pre>
     *
     * <code>string order_by = 3;</code>
     * @return The orderBy.
     */
    public java.lang.String getOrderBy() {
      java.lang.Object ref = orderBy_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        orderBy_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Optional. E.g., reverse chronological order of event_time
     * </pre>
     *
     * <code>string order_by = 3;</code>
     * @return The bytes for orderBy.
     */
    public com.google.protobuf.ByteString
        getOrderByBytes() {
      java.lang.Object ref = orderBy_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        orderBy_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Optional. E.g., reverse chronological order of event_time
     * </pre>
     *
     * <code>string order_by = 3;</code>
     * @param value The orderBy to set.
     * @return This builder for chaining.
     */
    public Builder setOrderBy(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      orderBy_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. E.g., reverse chronological order of event_time
     * </pre>
     *
     * <code>string order_by = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearOrderBy() {
      
      orderBy_ = getDefaultInstance().getOrderBy();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. E.g., reverse chronological order of event_time
     * </pre>
     *
     * <code>string order_by = 3;</code>
     * @param value The bytes for orderBy to set.
     * @return This builder for chaining.
     */
    public Builder setOrderByBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      orderBy_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object pageToken_ = "";
    /**
     * <pre>
     * Optional. If present, then retrieve the next batch of results from the preceding call
     * to this request.
     * </pre>
     *
     * <code>string page_token = 4;</code>
     * @return The pageToken.
     */
    public java.lang.String getPageToken() {
      java.lang.Object ref = pageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Optional. If present, then retrieve the next batch of results from the preceding call
     * to this request.
     * </pre>
     *
     * <code>string page_token = 4;</code>
     * @return The bytes for pageToken.
     */
    public com.google.protobuf.ByteString
        getPageTokenBytes() {
      java.lang.Object ref = pageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        pageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Optional. If present, then retrieve the next batch of results from the preceding call
     * to this request.
     * </pre>
     *
     * <code>string page_token = 4;</code>
     * @param value The pageToken to set.
     * @return This builder for chaining.
     */
    public Builder setPageToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      pageToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. If present, then retrieve the next batch of results from the preceding call
     * to this request.
     * </pre>
     *
     * <code>string page_token = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearPageToken() {
      
      pageToken_ = getDefaultInstance().getPageToken();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. If present, then retrieve the next batch of results from the preceding call
     * to this request.
     * </pre>
     *
     * <code>string page_token = 4;</code>
     * @param value The bytes for pageToken to set.
     * @return This builder for chaining.
     */
    public Builder setPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      pageToken_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:audit.v1.SearchRequest)
  }

  // @@protoc_insertion_point(class_scope:audit.v1.SearchRequest)
  private static final com.gridcsp.adelson.sdk.audit.protobuf.v1.SearchRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.gridcsp.adelson.sdk.audit.protobuf.v1.SearchRequest();
  }

  public static com.gridcsp.adelson.sdk.audit.protobuf.v1.SearchRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SearchRequest>
      PARSER = new com.google.protobuf.AbstractParser<SearchRequest>() {
    @java.lang.Override
    public SearchRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SearchRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SearchRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SearchRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.gridcsp.adelson.sdk.audit.protobuf.v1.SearchRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
