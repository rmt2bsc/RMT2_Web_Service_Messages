package org.rmt2.messages.accounting.inventory;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.rmt2.constants.ApiHeaderNames;
import org.rmt2.constants.ApiTransactionCodes;
import org.rmt2.constants.MessagingConstants;
import org.rmt2.jaxb.CreditorType;
import org.rmt2.jaxb.HeaderType;
import org.rmt2.jaxb.InventoryCriteriaGroup;
import org.rmt2.jaxb.InventoryItemtypeType;
import org.rmt2.jaxb.InventoryRequest;
import org.rmt2.jaxb.ItemCriteriaType;
import org.rmt2.jaxb.ObjectFactory;
import org.rmt2.util.HeaderTypeBuilder;

import com.api.config.ConfigConstants;
import com.api.config.SystemConfigurator;
import com.api.xml.jaxb.JaxbUtil;

public class ItemMasterQueryRequestBuilderTest {

    private JaxbUtil jaxb;
    
    @Before
    public void setUp() throws Exception {
        try {
            jaxb = SystemConfigurator.getJaxb(ConfigConstants.JAXB_CONTEXNAME_DEFAULT);
        }
        catch (Exception e) {
            jaxb = new JaxbUtil(MessagingConstants.JAXB_RMT2_PKG);
        }
    }
    
    @Test
    public void testBuildRequest() {
        ObjectFactory fact = new ObjectFactory();
        InventoryRequest req = fact.createInventoryRequest();
        
        HeaderType head =  HeaderTypeBuilder.Builder.create()
                .withApplication("accounting")
                .withModule("inventory")
                .withMessageMode(ApiHeaderNames.MESSAGE_MODE_REQUEST)
                .withDeliveryDate(new Date())
                
                // Set these header elements with dummy values in order to be properly assigned later.
                .withTransaction(ApiTransactionCodes.INVENTORY_ITEM_MASTER_GET)
                .withRouting(ApiTransactionCodes.ROUTE_ACCOUNTING)
                .withDeliveryMode(ApiHeaderNames.DUMMY_HEADER_VALUE).build();
        
        
        ItemCriteriaType criteria = fact.createItemCriteriaType();
        criteria.setItemId(BigInteger.valueOf(100));
        criteria.setActive(BigInteger.valueOf(1));
        criteria.setItemName("Dell Computer");
        criteria.setItemSerialNo("11111111");
        criteria.setMarkup(BigDecimal.valueOf(3));
        criteria.setUnitCost(BigDecimal.valueOf(150.89));
        criteria.setQtyOnHand(BigInteger.valueOf(10));
        criteria.setVendorItemNo("1234-4839");
        
        InventoryItemtypeType iit = fact.createInventoryItemtypeType();
        iit.setItemTypeId(BigInteger.valueOf(222));
        criteria.setItemType(iit);
        
        CreditorType cred = fact.createCreditorType();
        cred.setCreditorId(BigInteger.valueOf(1234567));
        criteria.setVendor(cred);
        
        InventoryCriteriaGroup criteriaGroup = fact.createInventoryCriteriaGroup();
        criteriaGroup.setItemCriteria(criteria);
        req.setCriteria(criteriaGroup);
        req.setHeader(head);
        
        String xml = jaxb.marshalJsonMessage(req);
        System.out.println(xml);
        Assert.assertNotNull(xml);
        Assert.assertTrue(xml.contains(ApiTransactionCodes.INVENTORY_ITEM_MASTER_GET));
    }
  
}
