/*
 * Copyright 2018 Comcast Cable Communications Management, LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.comcast.ip4s
package interop.scalaz

import _root_.scalaz.{Equal, Order, Show}

trait PortInstances {
  implicit val PortEqual: Equal[Port] = Equal.equalA[Port]
  implicit val PortOrder: Order[Port] = Order.fromScalaOrdering[Port]
  implicit val PortShow: Show[Port] = Show.showFromToString[Port]
}
