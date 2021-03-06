/*
 *    Copyright (C) 2017 Alexander Söderberg
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
 */
package xyz.kvantum.addon.mock;

import xyz.kvantum.addon.AddOn;
import xyz.kvantum.nanotube.NanoTube;

public class MockAddOn extends AddOn
{

    @Override
    protected void onEnable()
    {
        final NanoTube<String> nanoTube = NanoTube.construct( null ); // Just shows that we have the reference
        System.out.println( "Enabling " + this );
    }

    @Override
    protected void onDisable()
    {
        System.out.println( "Disabling " + this );
    }

}
