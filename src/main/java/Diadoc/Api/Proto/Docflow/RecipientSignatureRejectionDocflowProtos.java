// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Docflow/RecipientSignatureRejectionDocflow.proto

package Diadoc.Api.Proto.Docflow;

public final class RecipientSignatureRejectionDocflowProtos {
  private RecipientSignatureRejectionDocflowProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface RecipientSignatureRejectionDocflowOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // optional bool IsFinished = 1;
    boolean hasIsFinished();
    boolean getIsFinished();
    
    // optional .Diadoc.Api.Proto.Docflow.SignedAttachment RecipientSignatureRejectionAttachment = 2;
    boolean hasRecipientSignatureRejectionAttachment();
    Diadoc.Api.Proto.Docflow.AttachmentProtos.SignedAttachment getRecipientSignatureRejectionAttachment();
    Diadoc.Api.Proto.Docflow.AttachmentProtos.SignedAttachmentOrBuilder getRecipientSignatureRejectionAttachmentOrBuilder();
    
    // optional .Diadoc.Api.Proto.Timestamp DeliveryTimestamp = 3;
    boolean hasDeliveryTimestamp();
    Diadoc.Api.Proto.TimestampProtos.Timestamp getDeliveryTimestamp();
    Diadoc.Api.Proto.TimestampProtos.TimestampOrBuilder getDeliveryTimestampOrBuilder();
  }
  public static final class RecipientSignatureRejectionDocflow extends
      com.google.protobuf.GeneratedMessage
      implements RecipientSignatureRejectionDocflowOrBuilder {
    // Use RecipientSignatureRejectionDocflow.newBuilder() to construct.
    private RecipientSignatureRejectionDocflow(Builder builder) {
      super(builder);
    }
    private RecipientSignatureRejectionDocflow(boolean noInit) {}
    
    private static final RecipientSignatureRejectionDocflow defaultInstance;
    public static RecipientSignatureRejectionDocflow getDefaultInstance() {
      return defaultInstance;
    }
    
    public RecipientSignatureRejectionDocflow getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Diadoc.Api.Proto.Docflow.RecipientSignatureRejectionDocflowProtos.internal_static_Diadoc_Api_Proto_Docflow_RecipientSignatureRejectionDocflow_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Diadoc.Api.Proto.Docflow.RecipientSignatureRejectionDocflowProtos.internal_static_Diadoc_Api_Proto_Docflow_RecipientSignatureRejectionDocflow_fieldAccessorTable;
    }
    
    private int bitField0_;
    // optional bool IsFinished = 1;
    public static final int ISFINISHED_FIELD_NUMBER = 1;
    private boolean isFinished_;
    public boolean hasIsFinished() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public boolean getIsFinished() {
      return isFinished_;
    }
    
    // optional .Diadoc.Api.Proto.Docflow.SignedAttachment RecipientSignatureRejectionAttachment = 2;
    public static final int RECIPIENTSIGNATUREREJECTIONATTACHMENT_FIELD_NUMBER = 2;
    private Diadoc.Api.Proto.Docflow.AttachmentProtos.SignedAttachment recipientSignatureRejectionAttachment_;
    public boolean hasRecipientSignatureRejectionAttachment() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public Diadoc.Api.Proto.Docflow.AttachmentProtos.SignedAttachment getRecipientSignatureRejectionAttachment() {
      return recipientSignatureRejectionAttachment_;
    }
    public Diadoc.Api.Proto.Docflow.AttachmentProtos.SignedAttachmentOrBuilder getRecipientSignatureRejectionAttachmentOrBuilder() {
      return recipientSignatureRejectionAttachment_;
    }
    
    // optional .Diadoc.Api.Proto.Timestamp DeliveryTimestamp = 3;
    public static final int DELIVERYTIMESTAMP_FIELD_NUMBER = 3;
    private Diadoc.Api.Proto.TimestampProtos.Timestamp deliveryTimestamp_;
    public boolean hasDeliveryTimestamp() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public Diadoc.Api.Proto.TimestampProtos.Timestamp getDeliveryTimestamp() {
      return deliveryTimestamp_;
    }
    public Diadoc.Api.Proto.TimestampProtos.TimestampOrBuilder getDeliveryTimestampOrBuilder() {
      return deliveryTimestamp_;
    }
    
    private void initFields() {
      isFinished_ = false;
      recipientSignatureRejectionAttachment_ = Diadoc.Api.Proto.Docflow.AttachmentProtos.SignedAttachment.getDefaultInstance();
      deliveryTimestamp_ = Diadoc.Api.Proto.TimestampProtos.Timestamp.getDefaultInstance();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (hasRecipientSignatureRejectionAttachment()) {
        if (!getRecipientSignatureRejectionAttachment().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      if (hasDeliveryTimestamp()) {
        if (!getDeliveryTimestamp().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBool(1, isFinished_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, recipientSignatureRejectionAttachment_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(3, deliveryTimestamp_);
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, isFinished_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, recipientSignatureRejectionAttachment_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, deliveryTimestamp_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static Diadoc.Api.Proto.Docflow.RecipientSignatureRejectionDocflowProtos.RecipientSignatureRejectionDocflow parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static Diadoc.Api.Proto.Docflow.RecipientSignatureRejectionDocflowProtos.RecipientSignatureRejectionDocflow parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static Diadoc.Api.Proto.Docflow.RecipientSignatureRejectionDocflowProtos.RecipientSignatureRejectionDocflow parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static Diadoc.Api.Proto.Docflow.RecipientSignatureRejectionDocflowProtos.RecipientSignatureRejectionDocflow parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static Diadoc.Api.Proto.Docflow.RecipientSignatureRejectionDocflowProtos.RecipientSignatureRejectionDocflow parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static Diadoc.Api.Proto.Docflow.RecipientSignatureRejectionDocflowProtos.RecipientSignatureRejectionDocflow parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static Diadoc.Api.Proto.Docflow.RecipientSignatureRejectionDocflowProtos.RecipientSignatureRejectionDocflow parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static Diadoc.Api.Proto.Docflow.RecipientSignatureRejectionDocflowProtos.RecipientSignatureRejectionDocflow parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static Diadoc.Api.Proto.Docflow.RecipientSignatureRejectionDocflowProtos.RecipientSignatureRejectionDocflow parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static Diadoc.Api.Proto.Docflow.RecipientSignatureRejectionDocflowProtos.RecipientSignatureRejectionDocflow parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(Diadoc.Api.Proto.Docflow.RecipientSignatureRejectionDocflowProtos.RecipientSignatureRejectionDocflow prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements Diadoc.Api.Proto.Docflow.RecipientSignatureRejectionDocflowProtos.RecipientSignatureRejectionDocflowOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return Diadoc.Api.Proto.Docflow.RecipientSignatureRejectionDocflowProtos.internal_static_Diadoc_Api_Proto_Docflow_RecipientSignatureRejectionDocflow_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Diadoc.Api.Proto.Docflow.RecipientSignatureRejectionDocflowProtos.internal_static_Diadoc_Api_Proto_Docflow_RecipientSignatureRejectionDocflow_fieldAccessorTable;
      }
      
      // Construct using Diadoc.Api.Proto.Docflow.RecipientSignatureRejectionDocflowProtos.RecipientSignatureRejectionDocflow.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getRecipientSignatureRejectionAttachmentFieldBuilder();
          getDeliveryTimestampFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        isFinished_ = false;
        bitField0_ = (bitField0_ & ~0x00000001);
        if (recipientSignatureRejectionAttachmentBuilder_ == null) {
          recipientSignatureRejectionAttachment_ = Diadoc.Api.Proto.Docflow.AttachmentProtos.SignedAttachment.getDefaultInstance();
        } else {
          recipientSignatureRejectionAttachmentBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        if (deliveryTimestampBuilder_ == null) {
          deliveryTimestamp_ = Diadoc.Api.Proto.TimestampProtos.Timestamp.getDefaultInstance();
        } else {
          deliveryTimestampBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Diadoc.Api.Proto.Docflow.RecipientSignatureRejectionDocflowProtos.RecipientSignatureRejectionDocflow.getDescriptor();
      }
      
      public Diadoc.Api.Proto.Docflow.RecipientSignatureRejectionDocflowProtos.RecipientSignatureRejectionDocflow getDefaultInstanceForType() {
        return Diadoc.Api.Proto.Docflow.RecipientSignatureRejectionDocflowProtos.RecipientSignatureRejectionDocflow.getDefaultInstance();
      }
      
      public Diadoc.Api.Proto.Docflow.RecipientSignatureRejectionDocflowProtos.RecipientSignatureRejectionDocflow build() {
        Diadoc.Api.Proto.Docflow.RecipientSignatureRejectionDocflowProtos.RecipientSignatureRejectionDocflow result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private Diadoc.Api.Proto.Docflow.RecipientSignatureRejectionDocflowProtos.RecipientSignatureRejectionDocflow buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        Diadoc.Api.Proto.Docflow.RecipientSignatureRejectionDocflowProtos.RecipientSignatureRejectionDocflow result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public Diadoc.Api.Proto.Docflow.RecipientSignatureRejectionDocflowProtos.RecipientSignatureRejectionDocflow buildPartial() {
        Diadoc.Api.Proto.Docflow.RecipientSignatureRejectionDocflowProtos.RecipientSignatureRejectionDocflow result = new Diadoc.Api.Proto.Docflow.RecipientSignatureRejectionDocflowProtos.RecipientSignatureRejectionDocflow(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.isFinished_ = isFinished_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (recipientSignatureRejectionAttachmentBuilder_ == null) {
          result.recipientSignatureRejectionAttachment_ = recipientSignatureRejectionAttachment_;
        } else {
          result.recipientSignatureRejectionAttachment_ = recipientSignatureRejectionAttachmentBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        if (deliveryTimestampBuilder_ == null) {
          result.deliveryTimestamp_ = deliveryTimestamp_;
        } else {
          result.deliveryTimestamp_ = deliveryTimestampBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Diadoc.Api.Proto.Docflow.RecipientSignatureRejectionDocflowProtos.RecipientSignatureRejectionDocflow) {
          return mergeFrom((Diadoc.Api.Proto.Docflow.RecipientSignatureRejectionDocflowProtos.RecipientSignatureRejectionDocflow)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(Diadoc.Api.Proto.Docflow.RecipientSignatureRejectionDocflowProtos.RecipientSignatureRejectionDocflow other) {
        if (other == Diadoc.Api.Proto.Docflow.RecipientSignatureRejectionDocflowProtos.RecipientSignatureRejectionDocflow.getDefaultInstance()) return this;
        if (other.hasIsFinished()) {
          setIsFinished(other.getIsFinished());
        }
        if (other.hasRecipientSignatureRejectionAttachment()) {
          mergeRecipientSignatureRejectionAttachment(other.getRecipientSignatureRejectionAttachment());
        }
        if (other.hasDeliveryTimestamp()) {
          mergeDeliveryTimestamp(other.getDeliveryTimestamp());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (hasRecipientSignatureRejectionAttachment()) {
          if (!getRecipientSignatureRejectionAttachment().isInitialized()) {
            
            return false;
          }
        }
        if (hasDeliveryTimestamp()) {
          if (!getDeliveryTimestamp().isInitialized()) {
            
            return false;
          }
        }
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              isFinished_ = input.readBool();
              break;
            }
            case 18: {
              Diadoc.Api.Proto.Docflow.AttachmentProtos.SignedAttachment.Builder subBuilder = Diadoc.Api.Proto.Docflow.AttachmentProtos.SignedAttachment.newBuilder();
              if (hasRecipientSignatureRejectionAttachment()) {
                subBuilder.mergeFrom(getRecipientSignatureRejectionAttachment());
              }
              input.readMessage(subBuilder, extensionRegistry);
              setRecipientSignatureRejectionAttachment(subBuilder.buildPartial());
              break;
            }
            case 26: {
              Diadoc.Api.Proto.TimestampProtos.Timestamp.Builder subBuilder = Diadoc.Api.Proto.TimestampProtos.Timestamp.newBuilder();
              if (hasDeliveryTimestamp()) {
                subBuilder.mergeFrom(getDeliveryTimestamp());
              }
              input.readMessage(subBuilder, extensionRegistry);
              setDeliveryTimestamp(subBuilder.buildPartial());
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // optional bool IsFinished = 1;
      private boolean isFinished_ ;
      public boolean hasIsFinished() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public boolean getIsFinished() {
        return isFinished_;
      }
      public Builder setIsFinished(boolean value) {
        bitField0_ |= 0x00000001;
        isFinished_ = value;
        onChanged();
        return this;
      }
      public Builder clearIsFinished() {
        bitField0_ = (bitField0_ & ~0x00000001);
        isFinished_ = false;
        onChanged();
        return this;
      }
      
      // optional .Diadoc.Api.Proto.Docflow.SignedAttachment RecipientSignatureRejectionAttachment = 2;
      private Diadoc.Api.Proto.Docflow.AttachmentProtos.SignedAttachment recipientSignatureRejectionAttachment_ = Diadoc.Api.Proto.Docflow.AttachmentProtos.SignedAttachment.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          Diadoc.Api.Proto.Docflow.AttachmentProtos.SignedAttachment, Diadoc.Api.Proto.Docflow.AttachmentProtos.SignedAttachment.Builder, Diadoc.Api.Proto.Docflow.AttachmentProtos.SignedAttachmentOrBuilder> recipientSignatureRejectionAttachmentBuilder_;
      public boolean hasRecipientSignatureRejectionAttachment() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public Diadoc.Api.Proto.Docflow.AttachmentProtos.SignedAttachment getRecipientSignatureRejectionAttachment() {
        if (recipientSignatureRejectionAttachmentBuilder_ == null) {
          return recipientSignatureRejectionAttachment_;
        } else {
          return recipientSignatureRejectionAttachmentBuilder_.getMessage();
        }
      }
      public Builder setRecipientSignatureRejectionAttachment(Diadoc.Api.Proto.Docflow.AttachmentProtos.SignedAttachment value) {
        if (recipientSignatureRejectionAttachmentBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          recipientSignatureRejectionAttachment_ = value;
          onChanged();
        } else {
          recipientSignatureRejectionAttachmentBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      public Builder setRecipientSignatureRejectionAttachment(
          Diadoc.Api.Proto.Docflow.AttachmentProtos.SignedAttachment.Builder builderForValue) {
        if (recipientSignatureRejectionAttachmentBuilder_ == null) {
          recipientSignatureRejectionAttachment_ = builderForValue.build();
          onChanged();
        } else {
          recipientSignatureRejectionAttachmentBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      public Builder mergeRecipientSignatureRejectionAttachment(Diadoc.Api.Proto.Docflow.AttachmentProtos.SignedAttachment value) {
        if (recipientSignatureRejectionAttachmentBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002) &&
              recipientSignatureRejectionAttachment_ != Diadoc.Api.Proto.Docflow.AttachmentProtos.SignedAttachment.getDefaultInstance()) {
            recipientSignatureRejectionAttachment_ =
              Diadoc.Api.Proto.Docflow.AttachmentProtos.SignedAttachment.newBuilder(recipientSignatureRejectionAttachment_).mergeFrom(value).buildPartial();
          } else {
            recipientSignatureRejectionAttachment_ = value;
          }
          onChanged();
        } else {
          recipientSignatureRejectionAttachmentBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      public Builder clearRecipientSignatureRejectionAttachment() {
        if (recipientSignatureRejectionAttachmentBuilder_ == null) {
          recipientSignatureRejectionAttachment_ = Diadoc.Api.Proto.Docflow.AttachmentProtos.SignedAttachment.getDefaultInstance();
          onChanged();
        } else {
          recipientSignatureRejectionAttachmentBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      public Diadoc.Api.Proto.Docflow.AttachmentProtos.SignedAttachment.Builder getRecipientSignatureRejectionAttachmentBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getRecipientSignatureRejectionAttachmentFieldBuilder().getBuilder();
      }
      public Diadoc.Api.Proto.Docflow.AttachmentProtos.SignedAttachmentOrBuilder getRecipientSignatureRejectionAttachmentOrBuilder() {
        if (recipientSignatureRejectionAttachmentBuilder_ != null) {
          return recipientSignatureRejectionAttachmentBuilder_.getMessageOrBuilder();
        } else {
          return recipientSignatureRejectionAttachment_;
        }
      }
      private com.google.protobuf.SingleFieldBuilder<
          Diadoc.Api.Proto.Docflow.AttachmentProtos.SignedAttachment, Diadoc.Api.Proto.Docflow.AttachmentProtos.SignedAttachment.Builder, Diadoc.Api.Proto.Docflow.AttachmentProtos.SignedAttachmentOrBuilder> 
          getRecipientSignatureRejectionAttachmentFieldBuilder() {
        if (recipientSignatureRejectionAttachmentBuilder_ == null) {
          recipientSignatureRejectionAttachmentBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              Diadoc.Api.Proto.Docflow.AttachmentProtos.SignedAttachment, Diadoc.Api.Proto.Docflow.AttachmentProtos.SignedAttachment.Builder, Diadoc.Api.Proto.Docflow.AttachmentProtos.SignedAttachmentOrBuilder>(
                  recipientSignatureRejectionAttachment_,
                  getParentForChildren(),
                  isClean());
          recipientSignatureRejectionAttachment_ = null;
        }
        return recipientSignatureRejectionAttachmentBuilder_;
      }
      
      // optional .Diadoc.Api.Proto.Timestamp DeliveryTimestamp = 3;
      private Diadoc.Api.Proto.TimestampProtos.Timestamp deliveryTimestamp_ = Diadoc.Api.Proto.TimestampProtos.Timestamp.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          Diadoc.Api.Proto.TimestampProtos.Timestamp, Diadoc.Api.Proto.TimestampProtos.Timestamp.Builder, Diadoc.Api.Proto.TimestampProtos.TimestampOrBuilder> deliveryTimestampBuilder_;
      public boolean hasDeliveryTimestamp() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public Diadoc.Api.Proto.TimestampProtos.Timestamp getDeliveryTimestamp() {
        if (deliveryTimestampBuilder_ == null) {
          return deliveryTimestamp_;
        } else {
          return deliveryTimestampBuilder_.getMessage();
        }
      }
      public Builder setDeliveryTimestamp(Diadoc.Api.Proto.TimestampProtos.Timestamp value) {
        if (deliveryTimestampBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          deliveryTimestamp_ = value;
          onChanged();
        } else {
          deliveryTimestampBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      public Builder setDeliveryTimestamp(
          Diadoc.Api.Proto.TimestampProtos.Timestamp.Builder builderForValue) {
        if (deliveryTimestampBuilder_ == null) {
          deliveryTimestamp_ = builderForValue.build();
          onChanged();
        } else {
          deliveryTimestampBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      public Builder mergeDeliveryTimestamp(Diadoc.Api.Proto.TimestampProtos.Timestamp value) {
        if (deliveryTimestampBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004) &&
              deliveryTimestamp_ != Diadoc.Api.Proto.TimestampProtos.Timestamp.getDefaultInstance()) {
            deliveryTimestamp_ =
              Diadoc.Api.Proto.TimestampProtos.Timestamp.newBuilder(deliveryTimestamp_).mergeFrom(value).buildPartial();
          } else {
            deliveryTimestamp_ = value;
          }
          onChanged();
        } else {
          deliveryTimestampBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      public Builder clearDeliveryTimestamp() {
        if (deliveryTimestampBuilder_ == null) {
          deliveryTimestamp_ = Diadoc.Api.Proto.TimestampProtos.Timestamp.getDefaultInstance();
          onChanged();
        } else {
          deliveryTimestampBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      public Diadoc.Api.Proto.TimestampProtos.Timestamp.Builder getDeliveryTimestampBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getDeliveryTimestampFieldBuilder().getBuilder();
      }
      public Diadoc.Api.Proto.TimestampProtos.TimestampOrBuilder getDeliveryTimestampOrBuilder() {
        if (deliveryTimestampBuilder_ != null) {
          return deliveryTimestampBuilder_.getMessageOrBuilder();
        } else {
          return deliveryTimestamp_;
        }
      }
      private com.google.protobuf.SingleFieldBuilder<
          Diadoc.Api.Proto.TimestampProtos.Timestamp, Diadoc.Api.Proto.TimestampProtos.Timestamp.Builder, Diadoc.Api.Proto.TimestampProtos.TimestampOrBuilder> 
          getDeliveryTimestampFieldBuilder() {
        if (deliveryTimestampBuilder_ == null) {
          deliveryTimestampBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              Diadoc.Api.Proto.TimestampProtos.Timestamp, Diadoc.Api.Proto.TimestampProtos.Timestamp.Builder, Diadoc.Api.Proto.TimestampProtos.TimestampOrBuilder>(
                  deliveryTimestamp_,
                  getParentForChildren(),
                  isClean());
          deliveryTimestamp_ = null;
        }
        return deliveryTimestampBuilder_;
      }
      
      // @@protoc_insertion_point(builder_scope:Diadoc.Api.Proto.Docflow.RecipientSignatureRejectionDocflow)
    }
    
    static {
      defaultInstance = new RecipientSignatureRejectionDocflow(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:Diadoc.Api.Proto.Docflow.RecipientSignatureRejectionDocflow)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_Diadoc_Api_Proto_Docflow_RecipientSignatureRejectionDocflow_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Diadoc_Api_Proto_Docflow_RecipientSignatureRejectionDocflow_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0Docflow/RecipientSignatureRejectionDoc" +
      "flow.proto\022\030Diadoc.Api.Proto.Docflow\032\017Ti" +
      "mestamp.proto\032\030Docflow/Attachment.proto\"" +
      "\313\001\n\"RecipientSignatureRejectionDocflow\022\022" +
      "\n\nIsFinished\030\001 \001(\010\022Y\n%RecipientSignature" +
      "RejectionAttachment\030\002 \001(\0132*.Diadoc.Api.P" +
      "roto.Docflow.SignedAttachment\0226\n\021Deliver" +
      "yTimestamp\030\003 \001(\0132\033.Diadoc.Api.Proto.Time" +
      "stampB*B(RecipientSignatureRejectionDocf" +
      "lowProtos"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_Diadoc_Api_Proto_Docflow_RecipientSignatureRejectionDocflow_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_Diadoc_Api_Proto_Docflow_RecipientSignatureRejectionDocflow_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_Diadoc_Api_Proto_Docflow_RecipientSignatureRejectionDocflow_descriptor,
              new java.lang.String[] { "IsFinished", "RecipientSignatureRejectionAttachment", "DeliveryTimestamp", },
              Diadoc.Api.Proto.Docflow.RecipientSignatureRejectionDocflowProtos.RecipientSignatureRejectionDocflow.class,
              Diadoc.Api.Proto.Docflow.RecipientSignatureRejectionDocflowProtos.RecipientSignatureRejectionDocflow.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          Diadoc.Api.Proto.TimestampProtos.getDescriptor(),
          Diadoc.Api.Proto.Docflow.AttachmentProtos.getDescriptor(),
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}