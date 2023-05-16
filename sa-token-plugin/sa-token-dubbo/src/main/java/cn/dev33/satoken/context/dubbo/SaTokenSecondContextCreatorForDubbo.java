/*
 * Copyright 2020-2099 sa-token.cc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.dev33.satoken.context.dubbo;

import cn.dev33.satoken.context.second.SaTokenSecondContext;
import cn.dev33.satoken.context.second.SaTokenSecondContextCreator;

/**
 * Sa-Token 二级上下文 - 创建器 [ Dubbo版 ]
 * 
 * @author click33
 * @since <= 1.34.0
 */
public class SaTokenSecondContextCreatorForDubbo implements SaTokenSecondContextCreator {

	@Override
	public SaTokenSecondContext create() {
		return new SaTokenSecondContextForDubbo();
	}

}