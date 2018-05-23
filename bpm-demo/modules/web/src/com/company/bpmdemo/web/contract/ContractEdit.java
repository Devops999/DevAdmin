package com.company.bpmdemo.web.contract;

import com.haulmont.bpm.gui.procactions.ProcActionsFrame;
import com.haulmont.cuba.gui.components.AbstractEditor;
import com.company.bpmdemo.entity.Contract;

import javax.inject.Inject;

public class ContractEdit extends AbstractEditor<Contract> {
    @Inject
    private ProcActionsFrame procActionsFrame;

    @Override
    protected void postInit() {
        initProcActionsFrame();
    }

    private void initProcActionsFrame() {
        procActionsFrame.initializer()
                .setBeforeStartProcessPredicate(this::commit)
                .setAfterStartProcessListener(() -> {
                    showNotification(getMessage("Process started"), NotificationType.HUMANIZED);
                    close(COMMIT_ACTION_ID);
                })
                .setBeforeCompleteTaskPredicate(this::commit)
                .setAfterCompleteTaskListener(() -> {
                    showNotification(getMessage("Task completed"), NotificationType.HUMANIZED);
                    close(COMMIT_ACTION_ID);
                })
                .init("Contract approval", getItem());
    }
}