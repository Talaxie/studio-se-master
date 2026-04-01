/**
 * Copyright (C) 2006-2021 Talaxie Inc. - www.deilink.fr
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.talend.sdk.component.studio.model.parameter.listener;

import java.util.function.Predicate;
import java.util.logging.Logger;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;
import org.talend.sdk.component.studio.i18n.Messages;
import org.talend.sdk.component.studio.model.parameter.ValidationLabel;

/**
 * Checks whether new value corresponds specified {@code regex}.
 *
 * IMPORTANT: to ensure we respect our java/web constraint we run only js regex
 * which are more limited than java ones.
 */
public class PatternValidator extends PropertyValidator {

    private final JsRegex pattern;

    public PatternValidator(final ValidationLabel label, final String regex) {
        super(label, Messages.getString("validation.pattern.error", regex));
        this.pattern = new JsRegex(regex);
    }

    @Override
    boolean validate(final Object newValue) {
        if (isEmpty(newValue)) {
            return true;
        }
        // validate the value by removing surrounding quotes if they exist
        return pattern.test(newValue.toString().replaceAll("^\"|\"$", ""));
    }

    @Override
    public String toString() {
        return pattern.regex;
    }

    private static class JsRegex implements Predicate<CharSequence> {

        private final String regex;

        private final String indicators;

        private JsRegex(final String regex) {
            if (regex.startsWith("/") && regex.length() > 1) {
                final int end = regex.lastIndexOf('/');
                if (end < 0) {
                    this.regex = regex;
                    this.indicators = "";
                } else {
                    this.regex = regex.substring(1, end);
                    this.indicators = regex.substring(end + 1);
                }
            } else {
                this.regex = regex;
                this.indicators = "";
            }
        }

        @Override
        public boolean test(final CharSequence text) {
            final String script = "new RegExp(regex, indicators).test(text)";
            final Context context = Context.enter();
            try {
                final Scriptable scope = context.initStandardObjects();
                scope.put("text", scope, text);
                scope.put("regex", scope, regex);
                scope.put("indicators", scope, indicators);
                return Context.toBoolean(context.evaluateString(scope, script, "test", 0, null));
            } catch (final Exception e) {
                Logger.getLogger(PatternValidator.class.getName()).warning(e.getMessage());
                return false;
            } finally {
                Context.exit();
            }
        }
    }
}
