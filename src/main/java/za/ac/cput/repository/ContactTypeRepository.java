/* ContactTypeRepository.java
 Author: Chad Siegelaar (218340982)
 Date: 07 April 2022
*/

package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.entity.ContactType;
import java.util.Set;

@Repository
public interface ContactTypeRepository extends JpaRepository<ContactType, String> {

}
