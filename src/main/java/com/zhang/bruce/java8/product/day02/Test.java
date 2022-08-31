package com.zhang.bruce.java8.product.day02;

import org.omg.CORBA.*;
import org.omg.CORBA.Object;

import javax.xml.ws.Response;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/7/27 9:30 下午
 */
public class Test {
    public static void main(String[] args) {
        ChainPatternDemo chainPatternDemo = new ChainPatternDemo();
        chainPatternDemo.exec(new Request() {
            @Override
            public Object target() {
                return null;
            }

            @Override
            public String operation() {
                return null;
            }

            @Override
            public NVList arguments() {
                return null;
            }

            @Override
            public NamedValue result() {
                return null;
            }

            @Override
            public Environment env() {
                return null;
            }

            @Override
            public ExceptionList exceptions() {
                return null;
            }

            @Override
            public ContextList contexts() {
                return null;
            }

            @Override
            public Context ctx() {
                return null;
            }

            @Override
            public void ctx(Context c) {

            }

            @Override
            public Any add_in_arg() {
                return null;
            }

            @Override
            public Any add_named_in_arg(String name) {
                return null;
            }

            @Override
            public Any add_inout_arg() {
                return null;
            }

            @Override
            public Any add_named_inout_arg(String name) {
                return null;
            }

            @Override
            public Any add_out_arg() {
                return null;
            }

            @Override
            public Any add_named_out_arg(String name) {
                return null;
            }

            @Override
            public void set_return_type(TypeCode tc) {

            }

            @Override
            public Any return_value() {
                return null;
            }

            @Override
            public void invoke() {

            }

            @Override
            public void send_oneway() {

            }

            @Override
            public void send_deferred() {

            }

            @Override
            public boolean poll_response() {
                return false;
            }

            @Override
            public void get_response() throws WrongTransaction {

            }
        }, new Response() {
            @Override
            public boolean cancel(boolean mayInterruptIfRunning) {
                return false;
            }

            @Override
            public boolean isCancelled() {
                return false;
            }

            @Override
            public boolean isDone() {
                return false;
            }

            @Override
            public Object get() throws InterruptedException, ExecutionException {
                return null;
            }

            @Override
            public Object get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
                return null;
            }

            @Override
            public Map<String, Object> getContext() {
                return null;
            }
        });
    }
}
