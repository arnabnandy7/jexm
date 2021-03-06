/*
 * Copyright (c) 2018 American Express Travel Related Services Company, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.americanexpress.jexm.resources.beans.people;

import com.americanexpress.jexm.annotation.Header;
import java.io.Serializable;

public class PersonFullnameHeaderIndexes implements Serializable {

  public PersonFullnameHeaderIndexes(String name, String middlename, String lastname) {
    this.name = name;
    this.middlename = middlename;
    this.lastname = lastname;
  }

  @Header(index = 0)
  private String name;

  @Header(index = 1)
  private String middlename;

  @Header(index = 2)
  private String lastname;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    PersonFullnameHeaderIndexes that = (PersonFullnameHeaderIndexes) o;

    if (name != null ? !name.equals(that.name) : that.name != null) return false;
    if (middlename != null ? !middlename.equals(that.middlename) : that.middlename != null)
      return false;
    return lastname != null ? lastname.equals(that.lastname) : that.lastname == null;
  }

  @Override
  public int hashCode() {
    int result = name != null ? name.hashCode() : 0;
    result = 31 * result + (middlename != null ? middlename.hashCode() : 0);
    result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return (name == null ? "(null)" : name)
        + " "
        + (middlename == null ? "(null)" : middlename)
        + " "
        + (lastname == null ? "(null)" : lastname);
  }
}
