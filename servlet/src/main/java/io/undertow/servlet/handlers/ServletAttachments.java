package io.undertow.servlet.handlers;

import java.util.List;

import io.undertow.servlet.api.TransportGuaranteeType;
import io.undertow.servlet.handlers.security.SingleConstraintMatch;
import io.undertow.util.AttachmentKey;

/**
 * @author Stuart Douglas
 */
public class ServletAttachments {

    public static final AttachmentKey<ServletChain> CURRENT_SERVLET = AttachmentKey.create(ServletChain.class);
    public static final AttachmentKey<ServletPathMatch> SERVLET_PATH_MATCH = AttachmentKey.create(ServletPathMatch.class);

    public static final AttachmentKey<List<SingleConstraintMatch>> REQUIRED_CONSTRAINTS = AttachmentKey.create(List.class);
    public static final AttachmentKey<TransportGuaranteeType> TRANSPORT_GUARANTEE_TYPE = AttachmentKey.create(TransportGuaranteeType.class);
}
