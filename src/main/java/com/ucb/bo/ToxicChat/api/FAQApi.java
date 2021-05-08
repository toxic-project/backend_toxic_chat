package com.ucb.bo.ToxicChat.api;

import com.ucb.bo.ToxicChat.bl.FAQBl;
import com.ucb.bo.ToxicChat.bl.TransactionBl;
import com.ucb.bo.ToxicChat.dto.FAQResponse;
import com.ucb.bo.ToxicChat.model.FrequentAskedQuestion;
import com.ucb.bo.ToxicChat.model.Transactions;
import com.ucb.bo.ToxicChat.util.TransactionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping(value = "/faq")
public class FAQApi {
    private FAQBl faqBl;
    private TransactionBl transactionBl;

    @Autowired
    public FAQApi(FAQBl faqBl, TransactionBl transactionBl) {
        this.faqBl = faqBl;
        this.transactionBl = transactionBl;
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<FAQResponse> getFAQs() {
        return faqBl.getFAQs();
    }

    @RequestMapping(value = "/new", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public FrequentAskedQuestion newFAQ(@RequestBody FAQResponse newFAQ, HttpServletRequest request) {
        Transactions transaction = TransactionUtil.createTransaction(request);
        transactionBl.createTransaction(transaction);
        return faqBl.addNewFAQ(newFAQ, transaction);
    }
}
