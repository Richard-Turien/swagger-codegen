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
    define(['expect.js', '../../../js/petstore/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require('../../../js/petstore/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.SwaggerPetstore);
  }
}(this, function(expect, SwaggerPetstore) {
  'use strict';

  var instance;

  describe('petstore', function() {
    describe('NumberOnly', function() {
      beforeEach(function() {
        instance = new SwaggerPetstore.NumberOnly();
      });

      it('should create an instance of NumberOnly', function() {
        // TODO: update the code to test NumberOnly
        expect(instance).to.be.a(SwaggerPetstore.NumberOnly);
      });

      it('should have the property justNumber (base name: "JustNumber")', function() {
        // TODO: update the code to test the property justNumber
        expect(instance).to.have.property('justNumber');
        // expect(instance.justNumber).to.be(expectedValueLiteral);
      });

    });
  });

}));
