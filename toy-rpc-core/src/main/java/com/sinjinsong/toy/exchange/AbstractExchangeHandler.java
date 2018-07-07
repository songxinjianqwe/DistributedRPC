package com.sinjinsong.toy.exchange;


import com.sinjinsong.toy.config.ReferenceConfig;
import com.sinjinsong.toy.transport.client.RPCClient;
import com.sinjinsong.toy.transport.domain.RPCRequest;

/**
 * @author sinjinsong
 * @date 2018/6/10
 */
public abstract class AbstractExchangeHandler implements ExchangeHandler{
    protected RPCClient rpcClient;

    public AbstractExchangeHandler(RPCClient rpcClient) {
        this.rpcClient = rpcClient;
    }

    public abstract Object handleExchange(RPCRequest request, ReferenceConfig referenceConfig) throws Throwable;
}