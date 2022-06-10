// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: player.proto

package yxl.day3.dto;

public final class PlayerProto {
  private PlayerProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface playerOrBuilder extends
      // @@protoc_insertion_point(interface_extends:player)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string uname = 1;</code>
     * @return The uname.
     */
    String getUname();
    /**
     * <code>string uname = 1;</code>
     * @return The bytes for uname.
     */
    com.google.protobuf.ByteString
        getUnameBytes();

    /**
     * <code>string upwd = 2;</code>
     * @return The upwd.
     */
    String getUpwd();
    /**
     * <code>string upwd = 2;</code>
     * @return The bytes for upwd.
     */
    com.google.protobuf.ByteString
        getUpwdBytes();

    /**
     * <code>int32 serverId = 3;</code>
     * @return The serverId.
     */
    int getServerId();
  }
  /**
   * Protobuf type {@code player}
   */
  public static final class player extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:player)
      playerOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use player.newBuilder() to construct.
    private player(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private player() {
      uname_ = "";
      upwd_ = "";
    }

    @Override
    @SuppressWarnings({"unused"})
    protected Object newInstance(
        UnusedPrivateParameter unused) {
      return new player();
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private player(
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
            case 10: {
              String s = input.readStringRequireUtf8();

              uname_ = s;
              break;
            }
            case 18: {
              String s = input.readStringRequireUtf8();

              upwd_ = s;
              break;
            }
            case 24: {

              serverId_ = input.readInt32();
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
      return PlayerProto.internal_static_player_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return PlayerProto.internal_static_player_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              player.class, Builder.class);
    }

    public static final int UNAME_FIELD_NUMBER = 1;
    private volatile Object uname_;
    /**
     * <code>string uname = 1;</code>
     * @return The uname.
     */
    @Override
    public String getUname() {
      Object ref = uname_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        uname_ = s;
        return s;
      }
    }
    /**
     * <code>string uname = 1;</code>
     * @return The bytes for uname.
     */
    @Override
    public com.google.protobuf.ByteString
        getUnameBytes() {
      Object ref = uname_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        uname_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int UPWD_FIELD_NUMBER = 2;
    private volatile Object upwd_;
    /**
     * <code>string upwd = 2;</code>
     * @return The upwd.
     */
    @Override
    public String getUpwd() {
      Object ref = upwd_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        upwd_ = s;
        return s;
      }
    }
    /**
     * <code>string upwd = 2;</code>
     * @return The bytes for upwd.
     */
    @Override
    public com.google.protobuf.ByteString
        getUpwdBytes() {
      Object ref = upwd_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        upwd_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SERVERID_FIELD_NUMBER = 3;
    private int serverId_;
    /**
     * <code>int32 serverId = 3;</code>
     * @return The serverId.
     */
    @Override
    public int getServerId() {
      return serverId_;
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
      if (!getUnameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, uname_);
      }
      if (!getUpwdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, upwd_);
      }
      if (serverId_ != 0) {
        output.writeInt32(3, serverId_);
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getUnameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, uname_);
      }
      if (!getUpwdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, upwd_);
      }
      if (serverId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, serverId_);
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
      if (!(obj instanceof player)) {
        return super.equals(obj);
      }
      player other = (player) obj;

      if (!getUname()
          .equals(other.getUname())) return false;
      if (!getUpwd()
          .equals(other.getUpwd())) return false;
      if (getServerId()
          != other.getServerId()) return false;
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
      hash = (37 * hash) + UNAME_FIELD_NUMBER;
      hash = (53 * hash) + getUname().hashCode();
      hash = (37 * hash) + UPWD_FIELD_NUMBER;
      hash = (53 * hash) + getUpwd().hashCode();
      hash = (37 * hash) + SERVERID_FIELD_NUMBER;
      hash = (53 * hash) + getServerId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static player parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static player parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static player parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static player parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static player parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static player parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static player parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static player parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static player parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static player parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static player parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static player parseFrom(
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
    public static Builder newBuilder(player prototype) {
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
     * Protobuf type {@code player}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:player)
        playerOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return PlayerProto.internal_static_player_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return PlayerProto.internal_static_player_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                player.class, Builder.class);
      }

      // Construct using yxl.day3.dto.PlayerProto.player.newBuilder()
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
        uname_ = "";

        upwd_ = "";

        serverId_ = 0;

        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return PlayerProto.internal_static_player_descriptor;
      }

      @Override
      public player getDefaultInstanceForType() {
        return player.getDefaultInstance();
      }

      @Override
      public player build() {
        player result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public player buildPartial() {
        player result = new player(this);
        result.uname_ = uname_;
        result.upwd_ = upwd_;
        result.serverId_ = serverId_;
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
        if (other instanceof player) {
          return mergeFrom((player)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(player other) {
        if (other == player.getDefaultInstance()) return this;
        if (!other.getUname().isEmpty()) {
          uname_ = other.uname_;
          onChanged();
        }
        if (!other.getUpwd().isEmpty()) {
          upwd_ = other.upwd_;
          onChanged();
        }
        if (other.getServerId() != 0) {
          setServerId(other.getServerId());
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
        player parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (player) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private Object uname_ = "";
      /**
       * <code>string uname = 1;</code>
       * @return The uname.
       */
      public String getUname() {
        Object ref = uname_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          uname_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string uname = 1;</code>
       * @return The bytes for uname.
       */
      public com.google.protobuf.ByteString
          getUnameBytes() {
        Object ref = uname_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          uname_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string uname = 1;</code>
       * @param value The uname to set.
       * @return This builder for chaining.
       */
      public Builder setUname(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        uname_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string uname = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearUname() {
        
        uname_ = getDefaultInstance().getUname();
        onChanged();
        return this;
      }
      /**
       * <code>string uname = 1;</code>
       * @param value The bytes for uname to set.
       * @return This builder for chaining.
       */
      public Builder setUnameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        uname_ = value;
        onChanged();
        return this;
      }

      private Object upwd_ = "";
      /**
       * <code>string upwd = 2;</code>
       * @return The upwd.
       */
      public String getUpwd() {
        Object ref = upwd_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          upwd_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string upwd = 2;</code>
       * @return The bytes for upwd.
       */
      public com.google.protobuf.ByteString
          getUpwdBytes() {
        Object ref = upwd_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          upwd_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string upwd = 2;</code>
       * @param value The upwd to set.
       * @return This builder for chaining.
       */
      public Builder setUpwd(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        upwd_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string upwd = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearUpwd() {
        
        upwd_ = getDefaultInstance().getUpwd();
        onChanged();
        return this;
      }
      /**
       * <code>string upwd = 2;</code>
       * @param value The bytes for upwd to set.
       * @return This builder for chaining.
       */
      public Builder setUpwdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        upwd_ = value;
        onChanged();
        return this;
      }

      private int serverId_ ;
      /**
       * <code>int32 serverId = 3;</code>
       * @return The serverId.
       */
      @Override
      public int getServerId() {
        return serverId_;
      }
      /**
       * <code>int32 serverId = 3;</code>
       * @param value The serverId to set.
       * @return This builder for chaining.
       */
      public Builder setServerId(int value) {
        
        serverId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 serverId = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearServerId() {
        
        serverId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:player)
    }

    // @@protoc_insertion_point(class_scope:player)
    private static final player DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new player();
    }

    public static player getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<player>
        PARSER = new com.google.protobuf.AbstractParser<player>() {
      @Override
      public player parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new player(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<player> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<player> getParserForType() {
      return PARSER;
    }

    @Override
    public player getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_player_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_player_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\014player.proto\"7\n\006player\022\r\n\005uname\030\001 \001(\t\022" +
      "\014\n\004upwd\030\002 \001(\t\022\020\n\010serverId\030\003 \001(\005B\033\n\014yxl.d" +
      "ay3.dtoB\013PlayerProtob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_player_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_player_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_player_descriptor,
        new String[] { "Uname", "Upwd", "ServerId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
