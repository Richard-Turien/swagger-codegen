/*
 * Swagger Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.4.11-SNAPSHOT
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', '../../src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require('../../src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.SwaggerPetstore);
  }
}(this, function(expect, SwaggerPetstore) {
  'use strict';

  var instance;

  describe('(package)', function() {
    describe('OuterEnum', function() {
      beforeEach(function() {
        instance = SwaggerPetstore.OuterEnum;
      });

      it('should create an instance of OuterEnum', function() {
        // TODO: update the code to test OuterEnum
        expect(instance).to.be.a('object');
      });

      it('should have the property placed', function() {
        expect(instance).to.have.property('placed');
        expect(instance.placed).to.be("placed");
      });

      it('should have the property approved', function() {
        expect(instance).to.have.property('approved');
        expect(instance.approved).to.be("approved");
      });

      it('should have the property delivered', function() {
        expect(instance).to.have.property('delivered');
        expect(instance.delivered).to.be("delivered");
      });

    });
  });

}));
