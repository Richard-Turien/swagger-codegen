(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define([undefined, '../ApiClient', '../ApiModel', './Category', './Tag'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(undefined, require('../ApiClient'), require('../ApiModel'), require('./Category'), require('./Tag'));
  } else {
    // Browser globals (root is window)
    if (!root.SwaggerPetstore) {
      root.SwaggerPetstore = {};
    }
    factory(root.SwaggerPetstore, root.SwaggerPetstore.ApiClient, root.SwaggerPetstore.ApiModel, root.SwaggerPetstore.Category, root.SwaggerPetstore.Tag);
  }
}(this, function(module, ApiClient, ApiModel, Category, Tag) {
  'use strict';

  
  
//export module
if ( typeof define === "function" && define.amd ) {
	define('StatusEnum', [], function() {
        return StatusEnum;
	 });
}

var StatusEnum = function StatusEnum() {
	var self = this;


	/**
	 * @const
	 */
	self.AVAILABLE = "available",
	
	/**
	 * @const
	 */
	self.PENDING = "pending",
	
	/**
	 * @const
	 */
	self.SOLD = "sold";

}


  
  var Pet = function Pet(photoUrls, name) { 
    
    /**
     * datatype: Integer
     **/
    ApiModel.call(this);
    this['id'] = null;
    
    /**
     * datatype: Category
     **/
    ApiModel.call(this);
    this['category'] = new Category();
    
    /**
     * datatype: String
     * required
     **/
    ApiModel.call(this);
    this['name'] = name;
    
    /**
     * datatype: [String]
     * required
     **/
    ApiModel.call(this);
    this['photoUrls'] = photoUrls;
    
    /**
     * datatype: [Tag]
     **/
    ApiModel.call(this);
    this['tags'] = [];
    
    /**
     * pet status in the store
     * datatype: StatusEnum
     **/
    ApiModel.call(this);
    this['status'] = null;
    
  };

  Pet.prototype.constructFromObject = function(data) {
    if (!data) {
      return this;
    }
    
    if (data['id']) {
      this['id'] = ApiClient.convertToType(data['id'], 'Integer');
    }
    
    if (data['category']) {
      this['category'].constructFromObject(data['category']);
    }
    
    if (data['name']) {
      this['name'] = ApiClient.convertToType(data['name'], 'String');
    }
    
    if (data['photoUrls']) {
      this['photoUrls'] = ApiClient.convertToType(data['photoUrls'], ['String']);
    }
    
    if (data['tags']) {
      this['tags'] = ApiClient.convertToType(data['tags'], [Tag]);
    }
    
    if (data['status']) {
      this['status'] = ApiClient.convertToType(data['status'], 'String');
    }
    
    return this;
  }

  
  
  /**
   * @return {Integer}
   **/
  Pet.prototype.getId = function() {
    return this['id'];
  }

  /**
   * @param {Integer} id
   **/
  Pet.prototype.setId = function(id) {
    this['id'] = id;
  }
  
  /**
   * @return {Category}
   **/
  Pet.prototype.getCategory = function() {
    return this['category'];
  }

  /**
   * @param {Category} category
   **/
  Pet.prototype.setCategory = function(category) {
    this['category'] = category;
  }
  
  /**
   * @return {String}
   **/
  Pet.prototype.getName = function() {
    return this['name'];
  }

  /**
   * @param {String} name
   **/
  Pet.prototype.setName = function(name) {
    this['name'] = name;
  }
  
  /**
   * @return {[String]}
   **/
  Pet.prototype.getPhotoUrls = function() {
    return this['photoUrls'];
  }

  /**
   * @param {[String]} photoUrls
   **/
  Pet.prototype.setPhotoUrls = function(photoUrls) {
    this['photoUrls'] = photoUrls;
  }
  
  /**
   * @return {[Tag]}
   **/
  Pet.prototype.getTags = function() {
    return this['tags'];
  }

  /**
   * @param {[Tag]} tags
   **/
  Pet.prototype.setTags = function(tags) {
    this['tags'] = tags;
  }
  
  /**
   * get pet status in the store
   * @return {StatusEnum}
   **/
  Pet.prototype.getStatus = function() {
    return this['status'];
  }

  /**
   * set pet status in the store
   * @param {StatusEnum} status
   **/
  Pet.prototype.setStatus = function(status) {
    this['status'] = status;
  }
  
  

  if (module) {
    module.Pet = Pet;
  }

  return Pet;
  
  
}));
