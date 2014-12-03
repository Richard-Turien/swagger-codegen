/**
 *  Copyright 2014 Wordnik, Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

import com.wordnik.swagger.codegen.BasicScalaGenerator
import com.wordnik.swagger.codegen.PathUtil

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FlatSpec
import org.scalatest.Matchers 

@RunWith(classOf[JUnitRunner])
class PathUtilTest extends FlatSpec with Matchers {
  val pathUtil = new PathUtil {
  }

  behavior of "PathUtil"
  /*
   * We will take an api in the spec and create an API name from it
   */
  it should "convert an api name" in {
  	pathUtil.toApiName("fun") should be ("FunApi")
  }

  /*
   * We need to generate an API name from the resource path,
   * i.e. /foo will follow rules to become FooApi
  */
  it should "convert a path" in {
  	pathUtil.apiNameFromPath("/foo/bar/cats/dogs") should be ("FooApi")
  }

  /**
   * since swagger-spec 1.2 doesn't support `basePath` in the Resource Listing,
   * ensure the base path is extracted from the input host
   **/
  it should "get determine the basePath implicitly" in {
    sys.props -= "fileMap"
    pathUtil.getBasePath("http://foo.com/api-docs", "") should be ("http://foo.com/api-docs")
  }

  it should "be able to convert package path to file path" in {
    pathUtil.toFilePath(Some("com.example.package")) should be ("com/example/package")
    pathUtil.toFilePath(None) should be ("")
  }

}
