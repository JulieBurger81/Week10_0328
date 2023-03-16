/**
 * @author Julie Burger - jaburger
 * CIS175 - Spring 2023
 * Mar 16, 2023
 */
package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.Albums;

@Repository
public interface AlbumsRepository extends JpaRepository<Albums, Long> {
	
}
