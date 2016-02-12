(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define([undefined, '../ApiClient', '../ApiModel'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(undefined, require('../ApiClient'), require('../ApiModel'));
  } else {
    // Browser globals (root is window)
    if (!root.SwaggerPetstore) {
      root.SwaggerPetstore = {};
    }
    factory(root.SwaggerPetstore, root.SwaggerPetstore.ApiClient, root.SwaggerPetstore.ApiModel);
  }
}(this, function(module, ApiClient, ApiModel) {
  'use strict';

  
  

  
  var Category = function Category() { 
    ApiModel.call(this);
    
    /**
     * datatype: Integer
     **/
    this['id'] = null;
    
    /**
     * datatype: String
     **/
    this['name'] = null;
    
  };

  Category.prototype.constructFromObject = function(data) {
    if (!data) {
      return this;
    }
    
    if (data['id']) {
      this['id'] = ApiClient.convertToType(data['id'], 'Integer');
    }
    
    if (data['name']) {
      this['name'] = ApiClient.convertToType(data['name'], 'String');
    }
    
    return this;
  }

  
  
  /**
   * @return {Integer}
   **/
  Category.prototype.getId = function() {
    return this['id'];
  }

  /**
   * @param {Integer} id
   **/
  Category.prototype.setId = function(id) {
    this['id'] = id;
  }
  
  /**
   * @return {String}
   **/
  Category.prototype.getName = function() {
    return this['name'];
  }

  /**
   * @param {String} name
   **/
  Category.prototype.setName = function(name) {
    this['name'] = name;
  }
  
  

  if (module) {
    module.Category = Category;
  }

  return Category;
  
  
}));
