/**
 *   Copyright 2015 Tikal-Technology
 *
 *Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License
 */
package technology.tikal.customers.model;

import technology.tikal.customers.model.contact.PrimaryContact;
import technology.tikal.customers.model.contact.PrimaryContactPojo;
import technology.tikal.customers.model.name.Name;
/**
 * 
 * @author Nekorp
 *
 */
public class CustomerPojo implements Customer {
    
    private Long id;
    private Name name;
    private PrimaryContact primaryContact;

    public CustomerPojo() {
        this.primaryContact = new PrimaryContactPojo();
    }
    
    @Override
    public Name getName() {
        return name;
    }

    @Override
    public void setName(Name name) {
        this.name = name;
    }

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public PrimaryContact getPrimaryContact() {
        return this.primaryContact;
    }

    public void setPrimaryContact(PrimaryContact primaryContact) {
        this.primaryContact = primaryContact;
    }
}