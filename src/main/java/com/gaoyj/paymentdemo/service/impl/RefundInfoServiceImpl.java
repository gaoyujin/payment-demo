package com.gaoyj.paymentdemo.service.impl;

//import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
//import com.google.gson.Gson;
//import com.gaoyj.paymentdemo.entity.OrderInfo;
import com.gaoyj.paymentdemo.entity.RefundInfo;
//import com.gaoyj.paymentdemo.enums.wxpay.WxRefundStatus;
import com.gaoyj.paymentdemo.mapper.RefundInfoMapper;
//import com.gaoyj.paymentdemo.service.OrderInfoService;
import com.gaoyj.paymentdemo.service.RefundInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
//import com.gaoyj.paymentdemo.util.OrderNoUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.Duration;
import java.time.Instant;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RefundInfoServiceImpl extends ServiceImpl<RefundInfoMapper, RefundInfo> implements RefundInfoService {
//
//    @Resource
//    private OrderInfoService orderInfoService;
//
//    /**
//     * 根据订单号创建退款订单
//     * @param orderNo
//     * @param reason
//     * @return
//     */
//    @Override
//    public RefundInfo createRefundByOrderNo(String orderNo, String reason, String paymentType) {
//        // 获取订单信息
//        OrderInfo orderInfo = orderInfoService.getOrderByOrderNo(orderNo);
//
//        // 生成退款订单 根据订单号生成退款订单
//        RefundInfo refundInfo = new RefundInfo();
//        refundInfo.setOrderNo(orderNo);//订单编号
//        refundInfo.setRefundNo(OrderNoUtils.getRefundNo());//退款单编号
//        refundInfo.setTotalFee(orderInfo.getTotalFee());//原订单金额(分)
//        refundInfo.setRefund(orderInfo.getTotalFee());//退款金额(分)
//        refundInfo.setReason(reason);//退款原因
//        refundInfo.setPaymentType(paymentType);
//
//        //保存退款订单
//        baseMapper.insert(refundInfo);
//        return refundInfo;
//    }
//
//    /**
//     * 记录退款记录
//     * @param content
//     */
//    @Override
//    public void updateRefund(String content) {
//        // 将json字符串转换成Map
//        Gson gson = new Gson();
//        Map<String, String> resultMap = gson.fromJson(content, HashMap.class);
//        // 根据退款单编号修改退款单
//        QueryWrapper<RefundInfo> queryWrapper = new QueryWrapper<>();
//        queryWrapper.eq("refund_no", resultMap.get("out_refund_no"));
//
//        // 设置要修改的字段
//        RefundInfo refundInfo = new RefundInfo();
//        refundInfo.setRefundId(resultMap.get("refund_id"));//微信支付退款单号
//
//        // 查询退款或申请退款中的返回参数
//        if (resultMap.get("status") != null) {
//            refundInfo.setRefundStatus(resultMap.get("status"));
//            refundInfo.setContentReturn(content);
//        }
//
//        // 退款回调中的回调参数
//        if(resultMap.get("refund_status") != null){
//            refundInfo.setRefundStatus(resultMap.get("refund_status"));//退款状态
//            refundInfo.setContentNotify(content);//将全部响应结果存入数据库的content字段
//        }
//
//        //更新退款单
//        baseMapper.update(refundInfo, queryWrapper);
//    }
//
//    /**
//     * 查询一定时间范围内退款未成功的退款单
//     * @param minutes
//     * @return
//     */
//    @Override
//    public List<RefundInfo> getNoRefundOrderByDuration(int minutes, String payType) {
//        Instant instant = Instant.now().minus(Duration.ofMinutes(minutes));
//        QueryWrapper<RefundInfo> queryWrapper = new QueryWrapper<>();
//        queryWrapper.eq("refund_status", WxRefundStatus.PROCESSING.getType());
//        queryWrapper.le("create_time", instant);
//        queryWrapper.eq("payment_type", payType);
//        return baseMapper.selectList(queryWrapper);
//    }
//
//    /**
//     * 更新退款记录
//     * @param refundNo 退款单号
//     * @param body 退款响应内容
//     * @param status 状态
//     */
//    @Override
//    public void updateRefundForAlipay(String refundNo, String body, String status) {
//        // 1.设置要修改的字段
//        RefundInfo refundInfo = new RefundInfo();
//        refundInfo.setRefundStatus(status);//退款状态
//        refundInfo.setContentReturn(body);//将全部响应结果存入数据库的content字段
//
//        QueryWrapper<RefundInfo> queryWrapper = new QueryWrapper<>();
//        queryWrapper.eq("refund_no", refundNo);
//
//        // 2.更新退款单
//        baseMapper.update(refundInfo, queryWrapper);
//
//    }
}