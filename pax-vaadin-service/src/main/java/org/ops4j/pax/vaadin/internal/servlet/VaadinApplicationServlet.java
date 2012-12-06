/*
 * Copyright 2012 Achim Nierbeck, Scott Parkerson.
 *
 * Licensed  under the  Apache License,  Version 2.0  (the "License");
 * you may not use  this file  except in  compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed  under the  License is distributed on an "AS IS" BASIS,
 * WITHOUT  WARRANTIES OR CONDITIONS  OF ANY KIND, either  express  or
 * implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.ops4j.pax.vaadin.internal.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import com.vaadin.Application;
import com.vaadin.terminal.gwt.server.AbstractApplicationServlet;

public class VaadinApplicationServlet extends AbstractApplicationServlet {

	private static final long serialVersionUID = 1L;
	
	protected Class<? extends Application> appClazz = null;

	public VaadinApplicationServlet(Class<? extends Application> appClazz) {
	    this.appClazz = appClazz;
	}
	
	@Override
	protected ClassLoader getClassLoader()
	{
	    return appClazz.getClassLoader();
	}

    @Override
    protected Application getNewApplication(HttpServletRequest request) throws ServletException
    {
        try
        {
            return appClazz.newInstance();
        }
        catch (InstantiationException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (IllegalAccessException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null; // Should not happen
    }

    @Override
    protected Class<? extends Application> getApplicationClass() throws ClassNotFoundException
    {
        return this.appClazz;
    }
}