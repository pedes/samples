// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: inventory.proto

package com.manning.mss.ch08.sample04;

public interface LineItemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sample03.LineItem)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.sample03.Product product = 1;</code>
   */
  boolean hasProduct();
  /**
   * <code>.sample03.Product product = 1;</code>
   */
  com.manning.mss.ch08.sample04.Product getProduct();
  /**
   * <code>.sample03.Product product = 1;</code>
   */
  com.manning.mss.ch08.sample04.ProductOrBuilder getProductOrBuilder();

  /**
   * <code>int32 quantity = 2;</code>
   */
  int getQuantity();
}