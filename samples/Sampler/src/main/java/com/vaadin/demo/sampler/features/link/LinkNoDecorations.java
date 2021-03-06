package com.vaadin.demo.sampler.features.link;

import com.vaadin.demo.sampler.APIResource;
import com.vaadin.demo.sampler.Feature;
import com.vaadin.demo.sampler.NamedExternalResource;
import com.vaadin.demo.sampler.features.buttons.ButtonLink;
import com.vaadin.ui.Link;

@SuppressWarnings("serial")
public class LinkNoDecorations extends Feature {

    @Override
    public Version getSinceVersion() {
        return Version.OLD;
    }

    @Override
    public String getName() {
        return "Link, configure window";
    }

    @Override
    public String getDescription() {
        return "Links can open new browser windows, and configure the amount of browser features shown, such as toolbar and addressbar.<br/>These links open a browser window without decorations.";
    }

    @Override
    public APIResource[] getRelatedAPI() {
        return new APIResource[] { new APIResource(Link.class) };
    }

    @SuppressWarnings("unchecked")
    @Override
    public Class<? extends Feature>[] getRelatedFeatures() {
        return new Class[] { LinkCurrentWindow.class, LinkSizedWindow.class,
                ButtonLink.class };
    }

    @Override
    public NamedExternalResource[] getRelatedResources() {
        // TODO Auto-generated method stub
        return null;
    }

}
