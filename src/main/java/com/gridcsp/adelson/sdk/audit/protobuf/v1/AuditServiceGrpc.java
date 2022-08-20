package com.gridcsp.adelson.sdk.audit.protobuf.v1;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 * <pre>
 * Service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: audit.proto")
public final class AuditServiceGrpc {

  private AuditServiceGrpc() {}

  public static final String SERVICE_NAME = "audit.v1.AuditService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gridcsp.adelson.sdk.audit.protobuf.v1.AuditRequestById,
      com.gridcsp.adelson.sdk.audit.protobuf.v1.AuditRecord> METHOD_GET_AUDIT_RECORD =
      io.grpc.MethodDescriptor.<com.gridcsp.adelson.sdk.audit.protobuf.v1.AuditRequestById, com.gridcsp.adelson.sdk.audit.protobuf.v1.AuditRecord>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "audit.v1.AuditService", "getAuditRecord"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.gridcsp.adelson.sdk.audit.protobuf.v1.AuditRequestById.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.gridcsp.adelson.sdk.audit.protobuf.v1.AuditRecord.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gridcsp.adelson.sdk.audit.protobuf.v1.AuditLogRequest,
      com.gridcsp.adelson.sdk.audit.protobuf.v1.AuditRecord> METHOD_ADD_AUDIT_RECORD =
      io.grpc.MethodDescriptor.<com.gridcsp.adelson.sdk.audit.protobuf.v1.AuditLogRequest, com.gridcsp.adelson.sdk.audit.protobuf.v1.AuditRecord>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "audit.v1.AuditService", "addAuditRecord"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.gridcsp.adelson.sdk.audit.protobuf.v1.AuditLogRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.gridcsp.adelson.sdk.audit.protobuf.v1.AuditRecord.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.gridcsp.adelson.sdk.audit.protobuf.v1.SearchRequest,
      com.gridcsp.adelson.sdk.audit.protobuf.v1.SearchResponse> METHOD_SEARCH_AUDIT_RECORDS =
      io.grpc.MethodDescriptor.<com.gridcsp.adelson.sdk.audit.protobuf.v1.SearchRequest, com.gridcsp.adelson.sdk.audit.protobuf.v1.SearchResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "audit.v1.AuditService", "searchAuditRecords"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.gridcsp.adelson.sdk.audit.protobuf.v1.SearchRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.gridcsp.adelson.sdk.audit.protobuf.v1.SearchResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AuditServiceStub newStub(io.grpc.Channel channel) {
    return new AuditServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AuditServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AuditServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AuditServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AuditServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service
   * </pre>
   */
  public static abstract class AuditServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAuditRecord(com.gridcsp.adelson.sdk.audit.protobuf.v1.AuditRequestById request,
        io.grpc.stub.StreamObserver<com.gridcsp.adelson.sdk.audit.protobuf.v1.AuditRecord> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_AUDIT_RECORD, responseObserver);
    }

    /**
     */
    public void addAuditRecord(com.gridcsp.adelson.sdk.audit.protobuf.v1.AuditLogRequest request,
        io.grpc.stub.StreamObserver<com.gridcsp.adelson.sdk.audit.protobuf.v1.AuditRecord> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ADD_AUDIT_RECORD, responseObserver);
    }

    /**
     */
    public void searchAuditRecords(com.gridcsp.adelson.sdk.audit.protobuf.v1.SearchRequest request,
        io.grpc.stub.StreamObserver<com.gridcsp.adelson.sdk.audit.protobuf.v1.SearchResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SEARCH_AUDIT_RECORDS, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_AUDIT_RECORD,
            asyncUnaryCall(
              new MethodHandlers<
                com.gridcsp.adelson.sdk.audit.protobuf.v1.AuditRequestById,
                com.gridcsp.adelson.sdk.audit.protobuf.v1.AuditRecord>(
                  this, METHODID_GET_AUDIT_RECORD)))
          .addMethod(
            METHOD_ADD_AUDIT_RECORD,
            asyncUnaryCall(
              new MethodHandlers<
                com.gridcsp.adelson.sdk.audit.protobuf.v1.AuditLogRequest,
                com.gridcsp.adelson.sdk.audit.protobuf.v1.AuditRecord>(
                  this, METHODID_ADD_AUDIT_RECORD)))
          .addMethod(
            METHOD_SEARCH_AUDIT_RECORDS,
            asyncUnaryCall(
              new MethodHandlers<
                com.gridcsp.adelson.sdk.audit.protobuf.v1.SearchRequest,
                com.gridcsp.adelson.sdk.audit.protobuf.v1.SearchResponse>(
                  this, METHODID_SEARCH_AUDIT_RECORDS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service
   * </pre>
   */
  public static final class AuditServiceStub extends io.grpc.stub.AbstractStub<AuditServiceStub> {
    private AuditServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuditServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuditServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuditServiceStub(channel, callOptions);
    }

    /**
     */
    public void getAuditRecord(com.gridcsp.adelson.sdk.audit.protobuf.v1.AuditRequestById request,
        io.grpc.stub.StreamObserver<com.gridcsp.adelson.sdk.audit.protobuf.v1.AuditRecord> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_AUDIT_RECORD, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addAuditRecord(com.gridcsp.adelson.sdk.audit.protobuf.v1.AuditLogRequest request,
        io.grpc.stub.StreamObserver<com.gridcsp.adelson.sdk.audit.protobuf.v1.AuditRecord> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ADD_AUDIT_RECORD, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchAuditRecords(com.gridcsp.adelson.sdk.audit.protobuf.v1.SearchRequest request,
        io.grpc.stub.StreamObserver<com.gridcsp.adelson.sdk.audit.protobuf.v1.SearchResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEARCH_AUDIT_RECORDS, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service
   * </pre>
   */
  public static final class AuditServiceBlockingStub extends io.grpc.stub.AbstractStub<AuditServiceBlockingStub> {
    private AuditServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuditServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuditServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuditServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.gridcsp.adelson.sdk.audit.protobuf.v1.AuditRecord getAuditRecord(com.gridcsp.adelson.sdk.audit.protobuf.v1.AuditRequestById request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_AUDIT_RECORD, getCallOptions(), request);
    }

    /**
     */
    public com.gridcsp.adelson.sdk.audit.protobuf.v1.AuditRecord addAuditRecord(com.gridcsp.adelson.sdk.audit.protobuf.v1.AuditLogRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ADD_AUDIT_RECORD, getCallOptions(), request);
    }

    /**
     */
    public com.gridcsp.adelson.sdk.audit.protobuf.v1.SearchResponse searchAuditRecords(com.gridcsp.adelson.sdk.audit.protobuf.v1.SearchRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SEARCH_AUDIT_RECORDS, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service
   * </pre>
   */
  public static final class AuditServiceFutureStub extends io.grpc.stub.AbstractStub<AuditServiceFutureStub> {
    private AuditServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuditServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuditServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuditServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gridcsp.adelson.sdk.audit.protobuf.v1.AuditRecord> getAuditRecord(
        com.gridcsp.adelson.sdk.audit.protobuf.v1.AuditRequestById request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_AUDIT_RECORD, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gridcsp.adelson.sdk.audit.protobuf.v1.AuditRecord> addAuditRecord(
        com.gridcsp.adelson.sdk.audit.protobuf.v1.AuditLogRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ADD_AUDIT_RECORD, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gridcsp.adelson.sdk.audit.protobuf.v1.SearchResponse> searchAuditRecords(
        com.gridcsp.adelson.sdk.audit.protobuf.v1.SearchRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEARCH_AUDIT_RECORDS, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_AUDIT_RECORD = 0;
  private static final int METHODID_ADD_AUDIT_RECORD = 1;
  private static final int METHODID_SEARCH_AUDIT_RECORDS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AuditServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AuditServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_AUDIT_RECORD:
          serviceImpl.getAuditRecord((com.gridcsp.adelson.sdk.audit.protobuf.v1.AuditRequestById) request,
              (io.grpc.stub.StreamObserver<com.gridcsp.adelson.sdk.audit.protobuf.v1.AuditRecord>) responseObserver);
          break;
        case METHODID_ADD_AUDIT_RECORD:
          serviceImpl.addAuditRecord((com.gridcsp.adelson.sdk.audit.protobuf.v1.AuditLogRequest) request,
              (io.grpc.stub.StreamObserver<com.gridcsp.adelson.sdk.audit.protobuf.v1.AuditRecord>) responseObserver);
          break;
        case METHODID_SEARCH_AUDIT_RECORDS:
          serviceImpl.searchAuditRecords((com.gridcsp.adelson.sdk.audit.protobuf.v1.SearchRequest) request,
              (io.grpc.stub.StreamObserver<com.gridcsp.adelson.sdk.audit.protobuf.v1.SearchResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class AuditServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.gridcsp.adelson.sdk.audit.protobuf.v1.AuditProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AuditServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AuditServiceDescriptorSupplier())
              .addMethod(METHOD_GET_AUDIT_RECORD)
              .addMethod(METHOD_ADD_AUDIT_RECORD)
              .addMethod(METHOD_SEARCH_AUDIT_RECORDS)
              .build();
        }
      }
    }
    return result;
  }
}
