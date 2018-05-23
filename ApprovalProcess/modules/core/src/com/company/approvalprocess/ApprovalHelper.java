package com.company.approvalprocess;
import com.company.approvalprocess.entity.Contract;
import com.haulmont.cuba.core.EntityManager;
import com.haulmont.cuba.core.Persistence;
import com.haulmont.cuba.core.Transaction;
import javax.annotation.ManagedBean;
import javax.inject.Inject;
import java.util.UUID;



    @ManagedBean("approvalprocess_ApprovalHelper")
    public class ApprovalHelper {

        @Inject
        private Persistence persistence;

        public void updateState(UUID entityId, String state) {
            Transaction tx = persistence.getTransaction();
            try {
                EntityManager em = persistence.getEntityManager();
                Contract contract = em.find(Contract.class, entityId);
                if (contract != null) {
                    contract.setState(state);
                }
                tx.commit();
            } finally {
                tx.end();
            }
        }
    }

