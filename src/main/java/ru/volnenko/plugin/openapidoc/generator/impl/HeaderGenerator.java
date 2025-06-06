package ru.volnenko.plugin.openapidoc.generator.impl;

import lombok.NonNull;
import ru.volnenko.plugin.openapidoc.generator.IHeaderGenerator;
import ru.volnenko.plugin.openapidoc.util.StringUtil;

public final class HeaderGenerator implements IHeaderGenerator {

    public boolean headerFirstEnabled = true;

    public boolean tableOfContentsEnabled = true;

    public boolean headerSecondEnabled = true;

    @NonNull
    public String headerFirstText = "";

    @NonNull
    @Override
    public String headerFirstText() {
        return headerFirstText;
    }

    @Override
    public boolean headerSecondEnabled() {
        return headerSecondEnabled;
    }

    @Override
    public boolean tableOfContentsEnabled() {
        return tableOfContentsEnabled;
    }

    @Override
    public boolean headerFirstEnabled() {
        return headerFirstEnabled;
    }

    @NonNull
    @Override
    public IHeaderGenerator headerFirstEnabled(boolean headerFirstEnabled) {
        this.headerFirstEnabled = headerFirstEnabled;
        return this;
    }

    @NonNull
    @Override
    public IHeaderGenerator headerSecondEnabled(boolean headerSecondEnabled) {
        this.headerSecondEnabled = headerSecondEnabled;
        return this;
    }

    @NonNull
    @Override
    public IHeaderGenerator tableOfContentsEnabled(boolean tableOfContentsEnabled) {
        this.tableOfContentsEnabled = tableOfContentsEnabled;
        return this;
    }

    @NonNull
    @Override
    public IHeaderGenerator headerFirstText(@NonNull final String headerFirstText) {
        this.headerFirstText = headerFirstText;
        return this;
    }

    @NonNull
    @Override
    public StringBuilder append(@NonNull final StringBuilder stringBuilder) {
        if (headerFirstEnabled) {
            stringBuilder.append("= " + StringUtil.format(headerFirstText) + "\n");
            if (tableOfContentsEnabled) {
                stringBuilder.append(":toc-title: Оглавление\n");
                stringBuilder.append(":toc:\n");
            }
            stringBuilder.append("\n");
        }
        if (headerSecondEnabled) {
            stringBuilder.append("== Представление веб-сервисов \n");
            stringBuilder.append("\n");
        }
        return stringBuilder;
    }

}
