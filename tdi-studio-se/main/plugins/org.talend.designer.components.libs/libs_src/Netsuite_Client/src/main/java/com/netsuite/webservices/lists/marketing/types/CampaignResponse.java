
package com.netsuite.webservices.lists.marketing.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CampaignResponse.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CampaignResponse"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="_clickedThrough"/&gt;
 *     &lt;enumeration value="_failedDeliveryFailure"/&gt;
 *     &lt;enumeration value="_failedInvalidAddress"/&gt;
 *     &lt;enumeration value="_failedOther"/&gt;
 *     &lt;enumeration value="_failedSpam"/&gt;
 *     &lt;enumeration value="_failedTemplateError"/&gt;
 *     &lt;enumeration value="_failedUnexpectedError"/&gt;
 *     &lt;enumeration value="_invalidSenderAddress"/&gt;
 *     &lt;enumeration value="_mailboxDisabled"/&gt;
 *     &lt;enumeration value="_mailboxIsFull"/&gt;
 *     &lt;enumeration value="_mailboxNotAcceptingMessages"/&gt;
 *     &lt;enumeration value="_mailProtocolIssues"/&gt;
 *     &lt;enumeration value="_mediaError"/&gt;
 *     &lt;enumeration value="_messageExceedsSizeLengthLimits"/&gt;
 *     &lt;enumeration value="_networkServerIssues"/&gt;
 *     &lt;enumeration value="_opened"/&gt;
 *     &lt;enumeration value="_purchased"/&gt;
 *     &lt;enumeration value="_queued"/&gt;
 *     &lt;enumeration value="_received"/&gt;
 *     &lt;enumeration value="_responded"/&gt;
 *     &lt;enumeration value="_securityIssues"/&gt;
 *     &lt;enumeration value="_sent"/&gt;
 *     &lt;enumeration value="_skippedDueToPreviousHardBounce"/&gt;
 *     &lt;enumeration value="_subscribed"/&gt;
 *     &lt;enumeration value="_tooManyRecipients"/&gt;
 *     &lt;enumeration value="_unsubscribed"/&gt;
 *     &lt;enumeration value="_unsubscribedByFeedbackLoop"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CampaignResponse", namespace = "urn:types.marketing_2014_2.lists.webservices.netsuite.com")
@XmlEnum
public enum CampaignResponse {

    @XmlEnumValue("_clickedThrough")
    CLICKED_THROUGH("_clickedThrough"),
    @XmlEnumValue("_failedDeliveryFailure")
    FAILED_DELIVERY_FAILURE("_failedDeliveryFailure"),
    @XmlEnumValue("_failedInvalidAddress")
    FAILED_INVALID_ADDRESS("_failedInvalidAddress"),
    @XmlEnumValue("_failedOther")
    FAILED_OTHER("_failedOther"),
    @XmlEnumValue("_failedSpam")
    FAILED_SPAM("_failedSpam"),
    @XmlEnumValue("_failedTemplateError")
    FAILED_TEMPLATE_ERROR("_failedTemplateError"),
    @XmlEnumValue("_failedUnexpectedError")
    FAILED_UNEXPECTED_ERROR("_failedUnexpectedError"),
    @XmlEnumValue("_invalidSenderAddress")
    INVALID_SENDER_ADDRESS("_invalidSenderAddress"),
    @XmlEnumValue("_mailboxDisabled")
    MAILBOX_DISABLED("_mailboxDisabled"),
    @XmlEnumValue("_mailboxIsFull")
    MAILBOX_IS_FULL("_mailboxIsFull"),
    @XmlEnumValue("_mailboxNotAcceptingMessages")
    MAILBOX_NOT_ACCEPTING_MESSAGES("_mailboxNotAcceptingMessages"),
    @XmlEnumValue("_mailProtocolIssues")
    MAIL_PROTOCOL_ISSUES("_mailProtocolIssues"),
    @XmlEnumValue("_mediaError")
    MEDIA_ERROR("_mediaError"),
    @XmlEnumValue("_messageExceedsSizeLengthLimits")
    MESSAGE_EXCEEDS_SIZE_LENGTH_LIMITS("_messageExceedsSizeLengthLimits"),
    @XmlEnumValue("_networkServerIssues")
    NETWORK_SERVER_ISSUES("_networkServerIssues"),
    @XmlEnumValue("_opened")
    OPENED("_opened"),
    @XmlEnumValue("_purchased")
    PURCHASED("_purchased"),
    @XmlEnumValue("_queued")
    QUEUED("_queued"),
    @XmlEnumValue("_received")
    RECEIVED("_received"),
    @XmlEnumValue("_responded")
    RESPONDED("_responded"),
    @XmlEnumValue("_securityIssues")
    SECURITY_ISSUES("_securityIssues"),
    @XmlEnumValue("_sent")
    SENT("_sent"),
    @XmlEnumValue("_skippedDueToPreviousHardBounce")
    SKIPPED_DUE_TO_PREVIOUS_HARD_BOUNCE("_skippedDueToPreviousHardBounce"),
    @XmlEnumValue("_subscribed")
    SUBSCRIBED("_subscribed"),
    @XmlEnumValue("_tooManyRecipients")
    TOO_MANY_RECIPIENTS("_tooManyRecipients"),
    @XmlEnumValue("_unsubscribed")
    UNSUBSCRIBED("_unsubscribed"),
    @XmlEnumValue("_unsubscribedByFeedbackLoop")
    UNSUBSCRIBED_BY_FEEDBACK_LOOP("_unsubscribedByFeedbackLoop");
    private final String value;

    CampaignResponse(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CampaignResponse fromValue(String v) {
        for (CampaignResponse c: CampaignResponse.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
