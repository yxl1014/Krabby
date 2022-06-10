// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rank.proto

package yxl.day3.dto;

public final class RankProto {
  private RankProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface rankOrBuilder extends
      // @@protoc_insertion_point(interface_extends:rank)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 serverId = 1;</code>
     * @return The serverId.
     */
    int getServerId();

    /**
     * <code>int32 uid = 2;</code>
     * @return The uid.
     */
    int getUid();

    /**
     * <code>int32 uid2 = 3;</code>
     * @return The uid2.
     */
    int getUid2();

    /**
     * <code>int32 rank = 4;</code>
     * @return The rank.
     */
    int getRank();
  }
  /**
   * Protobuf type {@code rank}
   */
  public static final class rank extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:rank)
      rankOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use rank.newBuilder() to construct.
    private rank(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private rank() {
    }

    @Override
    @SuppressWarnings({"unused"})
    protected Object newInstance(
        UnusedPrivateParameter unused) {
      return new rank();
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private rank(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
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
            case 8: {

              serverId_ = input.readInt32();
              break;
            }
            case 16: {

              uid_ = input.readInt32();
              break;
            }
            case 24: {

              uid2_ = input.readInt32();
              break;
            }
            case 32: {

              rank_ = input.readInt32();
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
      return RankProto.internal_static_rank_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return RankProto.internal_static_rank_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              rank.class, Builder.class);
    }

    public static final int SERVERID_FIELD_NUMBER = 1;
    private int serverId_;
    /**
     * <code>int32 serverId = 1;</code>
     * @return The serverId.
     */
    @Override
    public int getServerId() {
      return serverId_;
    }

    public static final int UID_FIELD_NUMBER = 2;
    private int uid_;
    /**
     * <code>int32 uid = 2;</code>
     * @return The uid.
     */
    @Override
    public int getUid() {
      return uid_;
    }

    public static final int UID2_FIELD_NUMBER = 3;
    private int uid2_;
    /**
     * <code>int32 uid2 = 3;</code>
     * @return The uid2.
     */
    @Override
    public int getUid2() {
      return uid2_;
    }

    public static final int RANK_FIELD_NUMBER = 4;
    private int rank_;
    /**
     * <code>int32 rank = 4;</code>
     * @return The rank.
     */
    @Override
    public int getRank() {
      return rank_;
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (serverId_ != 0) {
        output.writeInt32(1, serverId_);
      }
      if (uid_ != 0) {
        output.writeInt32(2, uid_);
      }
      if (uid2_ != 0) {
        output.writeInt32(3, uid2_);
      }
      if (rank_ != 0) {
        output.writeInt32(4, rank_);
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (serverId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, serverId_);
      }
      if (uid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, uid_);
      }
      if (uid2_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, uid2_);
      }
      if (rank_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, rank_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof rank)) {
        return super.equals(obj);
      }
      rank other = (rank) obj;

      if (getServerId()
          != other.getServerId()) return false;
      if (getUid()
          != other.getUid()) return false;
      if (getUid2()
          != other.getUid2()) return false;
      if (getRank()
          != other.getRank()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + SERVERID_FIELD_NUMBER;
      hash = (53 * hash) + getServerId();
      hash = (37 * hash) + UID_FIELD_NUMBER;
      hash = (53 * hash) + getUid();
      hash = (37 * hash) + UID2_FIELD_NUMBER;
      hash = (53 * hash) + getUid2();
      hash = (37 * hash) + RANK_FIELD_NUMBER;
      hash = (53 * hash) + getRank();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static rank parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static rank parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static rank parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static rank parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static rank parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static rank parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static rank parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static rank parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static rank parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static rank parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static rank parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static rank parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(rank prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code rank}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:rank)
        rankOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return RankProto.internal_static_rank_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return RankProto.internal_static_rank_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                rank.class, Builder.class);
      }

      // Construct using yxl.day3.dto.RankProto.rank.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        serverId_ = 0;

        uid_ = 0;

        uid2_ = 0;

        rank_ = 0;

        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return RankProto.internal_static_rank_descriptor;
      }

      @Override
      public rank getDefaultInstanceForType() {
        return rank.getDefaultInstance();
      }

      @Override
      public rank build() {
        rank result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public rank buildPartial() {
        rank result = new rank(this);
        result.serverId_ = serverId_;
        result.uid_ = uid_;
        result.uid2_ = uid2_;
        result.rank_ = rank_;
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof rank) {
          return mergeFrom((rank)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(rank other) {
        if (other == rank.getDefaultInstance()) return this;
        if (other.getServerId() != 0) {
          setServerId(other.getServerId());
        }
        if (other.getUid() != 0) {
          setUid(other.getUid());
        }
        if (other.getUid2() != 0) {
          setUid2(other.getUid2());
        }
        if (other.getRank() != 0) {
          setRank(other.getRank());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        rank parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (rank) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int serverId_ ;
      /**
       * <code>int32 serverId = 1;</code>
       * @return The serverId.
       */
      @Override
      public int getServerId() {
        return serverId_;
      }
      /**
       * <code>int32 serverId = 1;</code>
       * @param value The serverId to set.
       * @return This builder for chaining.
       */
      public Builder setServerId(int value) {
        
        serverId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 serverId = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearServerId() {
        
        serverId_ = 0;
        onChanged();
        return this;
      }

      private int uid_ ;
      /**
       * <code>int32 uid = 2;</code>
       * @return The uid.
       */
      @Override
      public int getUid() {
        return uid_;
      }
      /**
       * <code>int32 uid = 2;</code>
       * @param value The uid to set.
       * @return This builder for chaining.
       */
      public Builder setUid(int value) {
        
        uid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 uid = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearUid() {
        
        uid_ = 0;
        onChanged();
        return this;
      }

      private int uid2_ ;
      /**
       * <code>int32 uid2 = 3;</code>
       * @return The uid2.
       */
      @Override
      public int getUid2() {
        return uid2_;
      }
      /**
       * <code>int32 uid2 = 3;</code>
       * @param value The uid2 to set.
       * @return This builder for chaining.
       */
      public Builder setUid2(int value) {
        
        uid2_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 uid2 = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearUid2() {
        
        uid2_ = 0;
        onChanged();
        return this;
      }

      private int rank_ ;
      /**
       * <code>int32 rank = 4;</code>
       * @return The rank.
       */
      @Override
      public int getRank() {
        return rank_;
      }
      /**
       * <code>int32 rank = 4;</code>
       * @param value The rank to set.
       * @return This builder for chaining.
       */
      public Builder setRank(int value) {
        
        rank_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 rank = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearRank() {
        
        rank_ = 0;
        onChanged();
        return this;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:rank)
    }

    // @@protoc_insertion_point(class_scope:rank)
    private static final rank DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new rank();
    }

    public static rank getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<rank>
        PARSER = new com.google.protobuf.AbstractParser<rank>() {
      @Override
      public rank parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new rank(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<rank> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<rank> getParserForType() {
      return PARSER;
    }

    @Override
    public rank getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_rank_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_rank_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\nrank.proto\"A\n\004rank\022\020\n\010serverId\030\001 \001(\005\022\013" +
      "\n\003uid\030\002 \001(\005\022\014\n\004uid2\030\003 \001(\005\022\014\n\004rank\030\004 \001(\005B" +
      "\031\n\014yxl.day3.dtoB\tRankProtob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_rank_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_rank_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_rank_descriptor,
        new String[] { "ServerId", "Uid", "Uid2", "Rank", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}