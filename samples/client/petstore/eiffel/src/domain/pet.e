note
 description:"[
		Swagger Petstore
 		This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
  		OpenAPI spec version: 1.0.0
 	    Contact: apiteam@swagger.io

  	NOTE: This class is auto generated by the swagger code generator program.

 		 Do not edit the class manually.
 	]"
	date: "$Date$"
	revision: "$Revision$"
	EIS:"Eiffel swagger codegen", "src=https://github.com/swagger-api/swagger-codegen.git", "protocol=uri"
class PET 

inherit

  ANY
      redefine
          out 
      end


feature --Access

    id: INTEGER_64 
      
    category: detachable CATEGORY 
      
    name: detachable STRING_32 
      
    photo_urls: detachable LIST [STRING_32] 
      
    tags: detachable LIST [TAG] 
      
    status: detachable STRING_32 
      -- pet status in the store

feature -- Change Element  
 
    set_id (a_name: like id)
        -- Set 'id' with 'a_name'.
      do
        id := a_name
      ensure
        id_set: id = a_name		
      end

    set_category (a_name: like category)
        -- Set 'category' with 'a_name'.
      do
        category := a_name
      ensure
        category_set: category = a_name		
      end

    set_name (a_name: like name)
        -- Set 'name' with 'a_name'.
      do
        name := a_name
      ensure
        name_set: name = a_name		
      end

    set_photo_urls (a_name: like photo_urls)
        -- Set 'photo_urls' with 'a_name'.
      do
        photo_urls := a_name
      ensure
        photo_urls_set: photo_urls = a_name		
      end

    set_tags (a_name: like tags)
        -- Set 'tags' with 'a_name'.
      do
        tags := a_name
      ensure
        tags_set: tags = a_name		
      end

    set_status (a_name: like status)
        -- Set 'status' with 'a_name'.
      do
        status := a_name
      ensure
        status_set: status = a_name		
      end


 feature -- Status Report

    out: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass PET%N")
        if attached id as l_id then
          Result.append ("%Nid:")
          Result.append (l_id.out)
          Result.append ("%N")    
        end  
        if attached category as l_category then
          Result.append ("%Ncategory:")
          Result.append (l_category.out)
          Result.append ("%N")    
        end  
        if attached name as l_name then
          Result.append ("%Nname:")
          Result.append (l_name.out)
          Result.append ("%N")    
        end  
        if attached photo_urls as l_photo_urls then
          across l_photo_urls as ic loop
            Result.append ("%N photo_urls:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end 
        if attached tags as l_tags then
          across l_tags as ic loop
            Result.append ("%N tags:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end 
        if attached status as l_status then
          Result.append ("%Nstatus:")
          Result.append (l_status.out)
          Result.append ("%N")    
        end  
      end
end


