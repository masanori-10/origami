/***********************************************************************
 * Copyright 2017 Kimio Kuramitsu and ORIGAMI project
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ***********************************************************************/

package blue.origami.ocode;

import blue.origami.lang.OEnv;
import blue.origami.lang.type.OType;
import blue.origami.lang.type.OUntypedType;
import blue.origami.util.OConsts;

public class OJumpCode<T> extends OParamCode<T> {

	protected OJumpCode(OEnv env, T handled, OCode expr) {
		super(handled, env.t(OUntypedType.class), expr);
	}

	protected OJumpCode(OEnv env, T handled) {
		super(handled, env.t(OUntypedType.class), OConsts.emptyNodes);
	}

	@Override
	public OCode refineType(OEnv env, OType t) {
		this.setType(t);
		return this;
	}

}