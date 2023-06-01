// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IGKOIHFJENN.proto

package emu.grasscutter.net.proto;

public final class IGKOIHFJENNOuterClass {
  private IGKOIHFJENNOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface IGKOIHFJENNOrBuilder extends
      // @@protoc_insertion_point(interface_extends:IGKOIHFJENN)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 group_id = 1;</code>
     * @return The groupId.
     */
    int getGroupId();

    /**
     * <code>uint32 MLIHCBDHMNF = 13;</code>
     * @return The mLIHCBDHMNF.
     */
    int getMLIHCBDHMNF();

    /**
     * <code>int32 retcode = 8;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * CmdId: 9204
   * </pre>
   *
   * Protobuf type {@code IGKOIHFJENN}
   */
  public static final class IGKOIHFJENN extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:IGKOIHFJENN)
      IGKOIHFJENNOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use IGKOIHFJENN.newBuilder() to construct.
    private IGKOIHFJENN(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private IGKOIHFJENN() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new IGKOIHFJENN();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private IGKOIHFJENN(
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
            case 8: {

              groupId_ = input.readUInt32();
              break;
            }
            case 64: {

              retcode_ = input.readInt32();
              break;
            }
            case 104: {

              mLIHCBDHMNF_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.IGKOIHFJENNOuterClass.internal_static_IGKOIHFJENN_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.IGKOIHFJENNOuterClass.internal_static_IGKOIHFJENN_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.IGKOIHFJENNOuterClass.IGKOIHFJENN.class, emu.grasscutter.net.proto.IGKOIHFJENNOuterClass.IGKOIHFJENN.Builder.class);
    }

    public static final int GROUP_ID_FIELD_NUMBER = 1;
    private int groupId_;
    /**
     * <code>uint32 group_id = 1;</code>
     * @return The groupId.
     */
    @java.lang.Override
    public int getGroupId() {
      return groupId_;
    }

    public static final int MLIHCBDHMNF_FIELD_NUMBER = 13;
    private int mLIHCBDHMNF_;
    /**
     * <code>uint32 MLIHCBDHMNF = 13;</code>
     * @return The mLIHCBDHMNF.
     */
    @java.lang.Override
    public int getMLIHCBDHMNF() {
      return mLIHCBDHMNF_;
    }

    public static final int RETCODE_FIELD_NUMBER = 8;
    private int retcode_;
    /**
     * <code>int32 retcode = 8;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
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
      if (groupId_ != 0) {
        output.writeUInt32(1, groupId_);
      }
      if (retcode_ != 0) {
        output.writeInt32(8, retcode_);
      }
      if (mLIHCBDHMNF_ != 0) {
        output.writeUInt32(13, mLIHCBDHMNF_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (groupId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, groupId_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(8, retcode_);
      }
      if (mLIHCBDHMNF_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, mLIHCBDHMNF_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.IGKOIHFJENNOuterClass.IGKOIHFJENN)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.IGKOIHFJENNOuterClass.IGKOIHFJENN other = (emu.grasscutter.net.proto.IGKOIHFJENNOuterClass.IGKOIHFJENN) obj;

      if (getGroupId()
          != other.getGroupId()) return false;
      if (getMLIHCBDHMNF()
          != other.getMLIHCBDHMNF()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
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
      hash = (37 * hash) + GROUP_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGroupId();
      hash = (37 * hash) + MLIHCBDHMNF_FIELD_NUMBER;
      hash = (53 * hash) + getMLIHCBDHMNF();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.IGKOIHFJENNOuterClass.IGKOIHFJENN parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.IGKOIHFJENNOuterClass.IGKOIHFJENN parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IGKOIHFJENNOuterClass.IGKOIHFJENN parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.IGKOIHFJENNOuterClass.IGKOIHFJENN parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IGKOIHFJENNOuterClass.IGKOIHFJENN parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.IGKOIHFJENNOuterClass.IGKOIHFJENN parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IGKOIHFJENNOuterClass.IGKOIHFJENN parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.IGKOIHFJENNOuterClass.IGKOIHFJENN parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IGKOIHFJENNOuterClass.IGKOIHFJENN parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.IGKOIHFJENNOuterClass.IGKOIHFJENN parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IGKOIHFJENNOuterClass.IGKOIHFJENN parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.IGKOIHFJENNOuterClass.IGKOIHFJENN parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.IGKOIHFJENNOuterClass.IGKOIHFJENN prototype) {
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
     * CmdId: 9204
     * </pre>
     *
     * Protobuf type {@code IGKOIHFJENN}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:IGKOIHFJENN)
        emu.grasscutter.net.proto.IGKOIHFJENNOuterClass.IGKOIHFJENNOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.IGKOIHFJENNOuterClass.internal_static_IGKOIHFJENN_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.IGKOIHFJENNOuterClass.internal_static_IGKOIHFJENN_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.IGKOIHFJENNOuterClass.IGKOIHFJENN.class, emu.grasscutter.net.proto.IGKOIHFJENNOuterClass.IGKOIHFJENN.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.IGKOIHFJENNOuterClass.IGKOIHFJENN.newBuilder()
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
        groupId_ = 0;

        mLIHCBDHMNF_ = 0;

        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.IGKOIHFJENNOuterClass.internal_static_IGKOIHFJENN_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.IGKOIHFJENNOuterClass.IGKOIHFJENN getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.IGKOIHFJENNOuterClass.IGKOIHFJENN.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.IGKOIHFJENNOuterClass.IGKOIHFJENN build() {
        emu.grasscutter.net.proto.IGKOIHFJENNOuterClass.IGKOIHFJENN result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.IGKOIHFJENNOuterClass.IGKOIHFJENN buildPartial() {
        emu.grasscutter.net.proto.IGKOIHFJENNOuterClass.IGKOIHFJENN result = new emu.grasscutter.net.proto.IGKOIHFJENNOuterClass.IGKOIHFJENN(this);
        result.groupId_ = groupId_;
        result.mLIHCBDHMNF_ = mLIHCBDHMNF_;
        result.retcode_ = retcode_;
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
        if (other instanceof emu.grasscutter.net.proto.IGKOIHFJENNOuterClass.IGKOIHFJENN) {
          return mergeFrom((emu.grasscutter.net.proto.IGKOIHFJENNOuterClass.IGKOIHFJENN)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.IGKOIHFJENNOuterClass.IGKOIHFJENN other) {
        if (other == emu.grasscutter.net.proto.IGKOIHFJENNOuterClass.IGKOIHFJENN.getDefaultInstance()) return this;
        if (other.getGroupId() != 0) {
          setGroupId(other.getGroupId());
        }
        if (other.getMLIHCBDHMNF() != 0) {
          setMLIHCBDHMNF(other.getMLIHCBDHMNF());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
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
        emu.grasscutter.net.proto.IGKOIHFJENNOuterClass.IGKOIHFJENN parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.IGKOIHFJENNOuterClass.IGKOIHFJENN) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int groupId_ ;
      /**
       * <code>uint32 group_id = 1;</code>
       * @return The groupId.
       */
      @java.lang.Override
      public int getGroupId() {
        return groupId_;
      }
      /**
       * <code>uint32 group_id = 1;</code>
       * @param value The groupId to set.
       * @return This builder for chaining.
       */
      public Builder setGroupId(int value) {
        
        groupId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 group_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearGroupId() {
        
        groupId_ = 0;
        onChanged();
        return this;
      }

      private int mLIHCBDHMNF_ ;
      /**
       * <code>uint32 MLIHCBDHMNF = 13;</code>
       * @return The mLIHCBDHMNF.
       */
      @java.lang.Override
      public int getMLIHCBDHMNF() {
        return mLIHCBDHMNF_;
      }
      /**
       * <code>uint32 MLIHCBDHMNF = 13;</code>
       * @param value The mLIHCBDHMNF to set.
       * @return This builder for chaining.
       */
      public Builder setMLIHCBDHMNF(int value) {
        
        mLIHCBDHMNF_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 MLIHCBDHMNF = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearMLIHCBDHMNF() {
        
        mLIHCBDHMNF_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 8;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 8;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
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


      // @@protoc_insertion_point(builder_scope:IGKOIHFJENN)
    }

    // @@protoc_insertion_point(class_scope:IGKOIHFJENN)
    private static final emu.grasscutter.net.proto.IGKOIHFJENNOuterClass.IGKOIHFJENN DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.IGKOIHFJENNOuterClass.IGKOIHFJENN();
    }

    public static emu.grasscutter.net.proto.IGKOIHFJENNOuterClass.IGKOIHFJENN getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<IGKOIHFJENN>
        PARSER = new com.google.protobuf.AbstractParser<IGKOIHFJENN>() {
      @java.lang.Override
      public IGKOIHFJENN parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new IGKOIHFJENN(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<IGKOIHFJENN> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<IGKOIHFJENN> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.IGKOIHFJENNOuterClass.IGKOIHFJENN getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_IGKOIHFJENN_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_IGKOIHFJENN_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021IGKOIHFJENN.proto\"E\n\013IGKOIHFJENN\022\020\n\010gr" +
      "oup_id\030\001 \001(\r\022\023\n\013MLIHCBDHMNF\030\r \001(\r\022\017\n\007ret" +
      "code\030\010 \001(\005B\033\n\031emu.grasscutter.net.protob" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_IGKOIHFJENN_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_IGKOIHFJENN_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_IGKOIHFJENN_descriptor,
        new java.lang.String[] { "GroupId", "MLIHCBDHMNF", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}