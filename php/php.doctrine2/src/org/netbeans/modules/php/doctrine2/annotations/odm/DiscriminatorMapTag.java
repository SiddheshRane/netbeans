/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.netbeans.modules.php.doctrine2.annotations.odm;

import org.netbeans.modules.csl.api.HtmlFormatter;
import org.netbeans.modules.php.spi.annotation.AnnotationCompletionTag;
import org.openide.util.NbBundle;

public class DiscriminatorMapTag extends AnnotationCompletionTag {

    public DiscriminatorMapTag() {
        super("DiscriminatorMap", // NOI18N
                "@DiscriminatorMap({\"${collection1}\" = \"${Document1}\"}, {\"${collection2}\" = \"${Document2}\"})", // NOI18N
                NbBundle.getMessage(DiscriminatorMapTag.class, "DiscriminatorFieldTag.documentation"));
    }

    @Override
    public void formatParameters(HtmlFormatter formatter) {
        formatter.appendText("("); //NOI18N
        formatter.parameters(true);
        formatter.appendText("{\"collection1\" = \"Document1\"}, {\"collection2\" = \"Document2\"}"); //NOI18N
        formatter.parameters(false);
        formatter.appendText(")"); //NOI18N
    }

}
